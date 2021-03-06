package com.gmail.wizaripost.gameserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.wizaripost.gameserver.DTO.Request;
import com.gmail.wizaripost.gameserver.DTO.response.GameParametersResponse;
import com.gmail.wizaripost.gameserver.storage.IResponseStorage;
import com.gmail.wizaripost.gameserver.storage.ResponseStorage;
import com.gmail.wizaripost.gameserver.utils.ChangeResponse;


public class GameParametersService implements IGameParametersService {
    private StringStorage stringStorage = new StringStorage();
    private ChangeResponse changeResponse = new ChangeResponse();
    private double credits = 5000.00;
    private boolean needTakeWin = false;
    private GameParametersResponse gameParametersResponse;
    private Request request;
    private IResponseStorage responseStorage = new ResponseStorage();


    @Override
    public String getGameSessionId(String languageCode, Long gameID, String gameMode) {
        return stringStorage.getGameSession();
    }

    @Override
    public GameParametersResponse getParams(String stringRequest, String gameInstanceID) {
        return this.jsonGetParams(parsingJsonStringIntoRequest(stringRequest), gameInstanceID);

    }

    @Override
    public GameParametersResponse jsonGetParams(Request request, String gameInstanceID) {
        this.request = request;
        if (request.getA().equals("Init")) {
            credits = 5000.00;
            needTakeWin = false;
            gameParametersResponse = responseStorage.getGameInit();
            gameParametersResponse.getC().setC1(credits);
            return gameParametersResponse;
        }
        if (request.getA().equals("TakeWin") && needTakeWin) {
            needTakeWin = false;
            gameParametersResponse = responseStorage.getTakeWin();
            credits += gameParametersResponse.getRsp().getTotalScore();
            gameParametersResponse.getC().setC1(credits);
            return gameParametersResponse;
        }
        if (request.getA().equals("Bet")) {
            return this.bet();
        }
        return new GameParametersResponse("007", "UnknownAction");
    }

    private GameParametersResponse bet() {
        if (!needTakeWin) {
            credits -= request.getB() * request.getLs();
            int a = 1, b = 10;
            int randomNumber = a + (int) (Math.random() * b);
            if (randomNumber <= 5) {
                gameParametersResponse = responseStorage.getBaseGameWin();
                gameParametersResponse.getC().setC1(credits);
                needTakeWin = true;
                return gameParametersResponse;
            } else {
                gameParametersResponse = responseStorage.getBaseGameLose();
                gameParametersResponse.getC().setC1(credits);
                return gameParametersResponse;
            }
        }
        return new GameParametersResponse("26", "LangErrorCannotProcessGame");
//        return gameParametersResponse = parsingJsonStringIntoGameParametersJSON(stringStorage.getNeedTakeWin());
    }

    private Request parsingJsonStringIntoRequest(String string) {
        Request request = new Request();
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jsonObj = mapper.readTree(string);
            request = mapper.treeToValue(jsonObj, Request.class);
//            request = mapper.convertValue(jsonObj, Request.class);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
        return request;
    }

    private GameParametersResponse parsingJsonStringIntoGameParametersJSON(String string) {
        GameParametersResponse params = new GameParametersResponse();
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jsonObj = mapper.readTree(string);
            params = mapper.treeToValue(jsonObj, GameParametersResponse.class);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
        return params;
    }

}


