package com.gmail.wizaripost.gameserver.service;

public interface IGameParametersService {

//    GameParameters getParams(Request request);
//
//    GameParameters getParams(String stringRequest);

    String getParams(String stringRequest, String gameInstanceID);

    String getGameSessionId(String languageCode, Long gameID, String gameMode);

}
