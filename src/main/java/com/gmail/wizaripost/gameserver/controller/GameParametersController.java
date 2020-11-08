package com.gmail.wizaripost.gameserver.controller;


import com.gmail.wizaripost.gameserver.DTO.GameParameters;
import com.gmail.wizaripost.gameserver.service.GameParametersService;
import com.gmail.wizaripost.gameserver.service.IGameParametersService;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/GetInitialParametersJson.aspx")
public class GameParametersController {

    private IGameParametersService service = new GameParametersService();

    //    public GameParameters getParams (@RequestBody Request request){

    @RequestMapping(value = "/GameProxy.aspx", method = RequestMethod.POST, consumes = "text/plain", produces = "application/json;charset=UTF-8")
    public String getParams(
            @RequestBody String request,
            @RequestParam(value = "GameInstanceID", required = false, defaultValue = "EN") String gameInstanceID) {
        return service.getParams(request, gameInstanceID);
    }



    @RequestMapping(value = "/GetInitialParametersJson.aspx", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
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


