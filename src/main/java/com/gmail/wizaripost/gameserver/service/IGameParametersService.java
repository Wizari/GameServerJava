package com.gmail.wizaripost.gameserver.service;

import com.gmail.wizaripost.gameserver.DTO.Request;

public interface IGameParametersService {

//    GameParameters getParams(Request request);
//
//    GameParameters getParams(String stringRequest);

    String getParams(Request request);

    String getParams(String stringRequest);

    String getGameSessionId(String languageCode, Long gameID, String gameMode);

}
