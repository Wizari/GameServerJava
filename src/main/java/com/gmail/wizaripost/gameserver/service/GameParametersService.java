package com.gmail.wizaripost.gameserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.wizaripost.gameserver.DTO.Request;


public class GameParametersService implements IGameParametersService {
    private StringStorage stringStorage = new StringStorage();

    @Override
    public String getGameSessionId(String languageCode, Long gameID, String gameMode) {
        return stringStorage.getGameSession();
    }

    @Override
    public String getParams(String stringRequest, String gameInstanceID) {
        Request request = parsingJsonStringIntoJsonNode(stringRequest);
//        System.out.println(request.getA());
//        System.out.println(request.getB());
//        System.out.println(request.getLs());
        if (request.getA().equals("Init")) {
            return stringStorage.getGameInit();
        }

        return null;
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


