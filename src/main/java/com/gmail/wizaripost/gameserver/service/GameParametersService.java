package com.gmail.wizaripost.gameserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.wizaripost.gameserver.entity.GameParameters;
import com.gmail.wizaripost.gameserver.entity.Request;

public class GameParametersService implements IGameParametersService {

    @Override
    public GameParameters getParams(Request request) {
        System.out.println(request.getA());
        System.out.println(request.getB());
        System.out.println(request.getLs());
        return new GameParameters("123123");
    }

    @Override
    public GameParameters getParams(String stringRequest) {
        Request request = parsingJsonStringIntoJsonNode(stringRequest);
        System.out.println(request.getA());
        System.out.println(request.getB());
        System.out.println(request.getLs());
        return new GameParameters("String getParams2222");
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


