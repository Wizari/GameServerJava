package com.gmail.wizaripost.gameserver.service;

import com.gmail.wizaripost.gameserver.DTO.response.GameParametersResponse;

public interface IGameParametersService {

//    GameParameters getParams(Request request);
//
//    GameParameters getParams(String stringRequest);

    GameParametersResponse getParams(String stringRequest, String gameInstanceID);

    String getGameSessionId(String languageCode, Long gameID, String gameMode);

}
