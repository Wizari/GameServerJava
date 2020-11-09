package com.gmail.wizaripost.gameserver.service;

import com.gmail.wizaripost.gameserver.DTO.Request;
import com.gmail.wizaripost.gameserver.DTO.response.GameParametersResponse;

public interface IGameParametersService {

//    GameParameters getParams(Request request);
//
//    GameParameters getParams(String stringRequest);

    GameParametersResponse getParams(String stringRequest, String gameInstanceID);

    GameParametersResponse jsonGetParams(Request request, String gameInstanceID);

    String getGameSessionId(String languageCode, Long gameID, String gameMode);

}
