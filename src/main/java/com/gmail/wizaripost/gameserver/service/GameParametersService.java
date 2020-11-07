package com.gmail.wizaripost.gameserver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.wizaripost.gameserver.DTO.Request;


public class GameParametersService implements IGameParametersService {

    @Override
    public String getParams(String stringRequest) {
        Request request = parsingJsonStringIntoJsonNode(stringRequest);
        System.out.println(request.getA());
        System.out.println(request.getB());
        System.out.println(request.getLs());
        return gameSession;
    }

    @Override
    public String getGameSessionId(String languageCode, Long gameID, String gameMode) {
        return gameSession;
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

    @Override
    public String getParams(Request request) {
        System.out.println(request.getA());
        System.out.println(request.getB());
        System.out.println(request.getLs());
        return new String("");
    }


    String gameSession = "{\"Status\": true,\"InitialParameters\": " +
            "{\"FileServerAddress\": \"http://localhost:8080/FileLoad.aspx\"," +
            "\"GameServerAddress\": \"http://localhost:8080/GameProxy.aspx\"," +
            "\"GameInstanceID\": \"6632b30e-f692-4097-be56-dd5100fb90ae-74131\"," +
            "\"GameID\": 250," +
            "\"GameUGN\": \"N/A\"," +
            "\"GameMode\": \"demoplay\"," +
            "\"LoaderVersion\": \"3.17.3\"," +
            "\"LoaderContextVersion\": \";3.17.3\"," +
            "\"LanguageCode\": \"EN\"," +
            "\"CurrencyCode\": \"FUN\"," +
            "\"AspectRatio\": \"\"," +
            "\"IsHistoryMode\": false," +
            "\"HistoryNo\": 1," +
            "\"MinimalPeriodBetweenBetsInSeconds\": 0," +
            "\"AccountServicesAddress\": \"\"," +
            "\"GameSessionID\": 74131," +
            "\"GameSessionSecureToken\": \"6632b30e-f692-4097-be56-dd5100fb90ae\"}}";



}


