package com.gmail.wizaripost.gameserver.service;

import com.gmail.wizaripost.gameserver.entity.GameParameters;
import com.gmail.wizaripost.gameserver.entity.Request;

public interface IGameParametersService {

    GameParameters getParams(Request request);

    GameParameters getParams(String stringRequest);
}
