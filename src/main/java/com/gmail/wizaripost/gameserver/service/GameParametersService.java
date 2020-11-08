package com.gmail.wizaripost.gameserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.wizaripost.gameserver.DTO.Request;
import com.gmail.wizaripost.gameserver.DTO.response.GameParametersResponse;
import com.gmail.wizaripost.gameserver.utils.ChangeResponse;


public class GameParametersService implements IGameParametersService {
    private StringStorage stringStorage = new StringStorage();
    private ChangeResponse changeResponse = new ChangeResponse();
    private double credits = 5000.00;
    private boolean needTakeWin = false;
    private GameParametersResponse gameParametersResponse;
    private Request request;



    @Override
    public String getGameSessionId(String languageCode, Long gameID, String gameMode) {
        credits = 5000.00;
        return stringStorage.getGameSession();

    }

    @Override
    public GameParametersResponse getParams(String stringRequest, String gameInstanceID) {
        request = parsingJsonStringIntoRequest(stringRequest);

        if (request.getA().equals("Init")) {
            gameParametersResponse = parsingJsonStringIntoGameParametersJSON(stringStorage.getGameInit());
            gameParametersResponse.getC().setC1(credits);
            return gameParametersResponse;
        }
        if (request.getA().equals("TakeWin") && needTakeWin) {
            needTakeWin = false;
            credits += 100;
//            String s1 = String.format("%.2f\n", 4.999995E7);
//            System.out.println(s1 + " = 4.999995E7");
            gameParametersResponse = parsingJsonStringIntoGameParametersJSON(stringStorage.getTakeWin());
            gameParametersResponse.getC().setC1(credits);
            return gameParametersResponse;
        }
        if (request.getA().equals("Bet")) {
            return this.bet(stringRequest);
        }
//        return null;
//        return gameParametersResponse = parsingJsonStringIntoGameParametersJSON(stringStorage.getNeedTakeWin());
        return null;
    }

    private GameParametersResponse bet(String stringRequest) {
        if (!needTakeWin) {
            credits -= request.getB() * request.getLs();
            int a = 1, b = 10;
            int randomNumber = a + (int) (Math.random() * b);
            if (randomNumber <= 5) {
                gameParametersResponse = parsingJsonStringIntoGameParametersJSON(stringStorage.getBaseGameWin());
                gameParametersResponse.getC().setC1(credits);
                needTakeWin = true;
                return gameParametersResponse;
            } else {
                gameParametersResponse = parsingJsonStringIntoGameParametersJSON(stringStorage.getBaseGameLose());
                gameParametersResponse.getC().setC1(credits);
                return gameParametersResponse;
            }
        }
//        return new GameParametersResponse("26", "LangErrorCannotProcessGame");
        return gameParametersResponse = parsingJsonStringIntoGameParametersJSON(stringStorage.getNeedTakeWin());
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


