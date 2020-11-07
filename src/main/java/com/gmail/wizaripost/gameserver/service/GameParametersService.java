package com.gmail.wizaripost.gameserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.wizaripost.gameserver.DTO.Request;
import com.gmail.wizaripost.gameserver.utils.ChangeResponse;


public class GameParametersService implements IGameParametersService {
    private StringStorage stringStorage = new StringStorage();
    private ChangeResponse changeResponse = new ChangeResponse();
    double credits = 50000000.00;

    @Override
    public String getGameSessionId(String languageCode, Long gameID, String gameMode) {
        credits = 50000000.00;
        return stringStorage.getGameSession();

    }

    @Override
    public String getParams(String stringRequest, String gameInstanceID) {
        Request request = parsingJsonStringIntoJsonNode(stringRequest);
        if (request.getA().equals("Init")) {
            return stringStorage.getGameInit();
        }
        if (request.getA().equals("TakeWin")) {
            return stringStorage.getTakeWin();
        }
        if (request.getA().equals("Bet")) {
            return this.bet(stringRequest);
        }
        return null;
    }

    private String bet(String stringRequest){
        Request request = parsingJsonStringIntoJsonNode(stringRequest);
        double bet = request.getB() * request.getLs();
        int a = 1, b = 10;
        int randomNumber = a + (int) (Math.random() * b);
        if (randomNumber <= 5) {
            credits += bet;
            return changeResponse.changeCredits(stringStorage.getBaseGameWin(), "c1", credits);
        } else {
            credits -= bet;
            return changeResponse.changeCredits(stringStorage.getBaseGameLose(), "c1", credits);
        }
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


