package com.gmail.wizaripost.gameserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.wizaripost.gameserver.DTO.Request;
import com.gmail.wizaripost.gameserver.DTO.resoult.GameParametersResponse;
import com.gmail.wizaripost.gameserver.utils.ChangeResponse;


public class GameParametersService implements IGameParametersService {
    private StringStorage stringStorage = new StringStorage();
    private ChangeResponse changeResponse = new ChangeResponse();
    private double credits = 5000.00;
    boolean needTakeWin = false;
    GameParametersResponse gameParametersRespons;


    @Override
    public String getGameSessionId(String languageCode, Long gameID, String gameMode) {
        credits = 5000.00;
        return stringStorage.getGameSession();

    }

    @Override
    public GameParametersResponse getParams(String stringRequest, String gameInstanceID) {
        Request request = parsingJsonStringIntoRequest(stringRequest);

        if (request.getA().equals("Init")) {
            gameParametersRespons = parsingJsonStringIntoGameParametersJSON(stringStorage.getGameInit());
            gameParametersRespons.getC().setC1(credits);
            return gameParametersRespons;
        }
        if (request.getA().equals("TakeWin")) {
            needTakeWin = false;
            credits += 100;
//            String s1 = String.format("%.2f\n", 4.999995E7);
//            System.out.println(s1 + " = 4.999995E7");
            gameParametersRespons = parsingJsonStringIntoGameParametersJSON(stringStorage.getTakeWin());
            gameParametersRespons.getC().setC1(credits);
            return gameParametersRespons;
        }
        if (request.getA().equals("Bet")) {
            credits -= request.getB() * request.getLs();
            ;
            return this.bet(stringRequest);
        }
        return null;
    }

    private GameParametersResponse bet(String stringRequest) {
        if (!needTakeWin) {
//            int a = 1, b = 10;
            int a = 1, b = 10;
            int randomNumber = a + (int) (Math.random() * b);
            if (randomNumber <= 5) {
                gameParametersRespons = parsingJsonStringIntoGameParametersJSON(stringStorage.getBaseGameWin());
                gameParametersRespons.getC().setC1(credits);
                needTakeWin = true;
                return gameParametersRespons;
            } else {
                gameParametersRespons = parsingJsonStringIntoGameParametersJSON(stringStorage.getBaseGameLose());
                gameParametersRespons.getC().setC1(credits);
                return gameParametersRespons;
            }
        }
//        return stringStorage.needTakeWin;
        return new GameParametersResponse();
    }

    private Request parsingJsonStringIntoRequest(String string) {
        Request request = new Request();
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jsonObj = mapper.readTree(string);
            request = mapper.treeToValue(jsonObj, Request.class);
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


