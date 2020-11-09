package com.gmail.wizaripost.gameserver.storage;

import com.gmail.wizaripost.gameserver.DTO.response.GameParametersResponse;

public interface IResponseStorage {

    GameParametersResponse getGameInit();
    GameParametersResponse getBaseGameWin();
    GameParametersResponse getBaseGameLose();
    GameParametersResponse getTakeWin();
    GameParametersResponse getGameSessionId();
}
