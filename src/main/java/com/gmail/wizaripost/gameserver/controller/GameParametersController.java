package com.gmail.wizaripost.gameserver.controller;


import com.gmail.wizaripost.gameserver.DTO.GameParameters;
import com.gmail.wizaripost.gameserver.service.GameParametersService;
import com.gmail.wizaripost.gameserver.service.IGameParametersService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GetInitialParametersJson.aspx")
public class GameParametersController {

    private IGameParametersService service = new GameParametersService();

    //    public GameParameters getParams (@RequestBody Request request){

    @RequestMapping(method = RequestMethod.GET, consumes = "text/plain")
    public String getParams(@RequestBody String request) {
        return service.getParams(request);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getGameSessionId(
            @RequestParam(value = "languageCode", required = false, defaultValue = "EN") String languageCode,
            @RequestParam(value = "gameID", required = false) Long gameID,
            @RequestParam(value = "gameMode", required = false) String gameMode) {
        System.out.println(languageCode);
        System.out.println(gameID);
        System.out.println(gameMode);
        return service.getGameSessionId(languageCode, gameID, gameMode);
    }
}


