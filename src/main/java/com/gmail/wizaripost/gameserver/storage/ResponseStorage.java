package com.gmail.wizaripost.gameserver.storage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.wizaripost.gameserver.DTO.response.GameParametersResponse;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;

public class ResponseStorage implements IResponseStorage {

    @Override
    public GameParametersResponse getGameSessionId() {
        return getResponseFromRandomFileFromDirectory("resourcesStorage/gameSessionId/");
    }

    @Override
    public GameParametersResponse getGameInit() {
        return getResponseFromRandomFileFromDirectory("resourcesStorage/gameInit/");
    }

    @Override
    public GameParametersResponse getBaseGameWin() {
        return getResponseFromRandomFileFromDirectory("resourcesStorage/gameWin/");
    }

    @Override
    public GameParametersResponse getBaseGameLose() {
            return getResponseFromRandomFileFromDirectory("resourcesStorage/gameLose/");
    }

    @Override
    public GameParametersResponse getTakeWin() {
        return getResponseFromRandomFileFromDirectory("resourcesStorage/takeWin/");
    }


    private GameParametersResponse getResponseFromRandomFileFromDirectory(String FilePath) {
        ObjectMapper mapper = new ObjectMapper();
        GameParametersResponse gameParametersResponse = new GameParametersResponse();
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            URL resource = classLoader.getResource(FilePath);
            File file = new File(resource.toURI());
            File[] files = file.listFiles();
            Random rand = new Random();
            gameParametersResponse = mapper.readValue(files[rand.nextInt(files.length)], GameParametersResponse.class);
        } catch (IOException | URISyntaxException e) {
            System.out.println(e.getMessage());
        }
        return gameParametersResponse;
    }

}

