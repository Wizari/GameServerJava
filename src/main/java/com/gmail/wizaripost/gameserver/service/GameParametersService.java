package com.gmail.wizaripost.gameserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.wizaripost.gameserver.DTO.Request;
import com.gmail.wizaripost.gameserver.utils.ChangeResponse;


public class GameParametersService implements IGameParametersService {
    private StringStorage stringStorage = new StringStorage();
    private ChangeResponse changeResponse = new ChangeResponse();
    private double credits = 50000000.00;
    boolean needTakeWin = false;

    @Override
    public String getGameSessionId(String languageCode, Long gameID, String gameMode) {
        credits = 50000000.00;
        return stringStorage.getGameSession();

    }

    @Override
    public String getParams(String stringRequest, String gameInstanceID) {
        Request request = parsingJsonStringIntoJsonNode(stringRequest);
        if (request.getA().equals("Init")) {
//            return stringStorage.getGameInit();
            return changeResponse.changeCredits(stringStorage.getGameInit(), "c1", credits);
        }
        if (request.getA().equals("TakeWin")) {
            needTakeWin = false;
//            return stringStorage.getTakeWin();
            return changeResponse.changeCredits(stringStorage.getTakeWin(), "c1", credits);
        }
        if (request.getA().equals("Bet")) {
            return this.bet(stringRequest);
        }
        return null;
    }

    private String bet(String stringRequest){
        Request request = parsingJsonStringIntoJsonNode(stringRequest);
        if (!needTakeWin) {
            double bet = request.getB() * request.getLs();
            int a = 1, b = 10;
            int randomNumber = a + (int) (Math.random() * b);
            if (randomNumber <= 5) {
                credits += bet;
                needTakeWin = true;
                return changeResponse.changeCredits(stringStorage.getBaseGameWin(), "c1", credits);
            } else {
                credits -= bet;
                return changeResponse.changeCredits(stringStorage.getBaseGameLose(), "c1", credits);
            }
        }
        return stringStorage.needTakeWin;
    }

    private Request parsingJsonStringIntoJsonNode(String string) {
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

}


