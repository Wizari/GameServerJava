package com.gmail.wizaripost.gameserver.controller;


import com.gmail.wizaripost.gameserver.entity.GameParameters;
import com.gmail.wizaripost.gameserver.service.GameParametersService;
import com.gmail.wizaripost.gameserver.service.IGameParametersService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GetInitialParametersJson.aspx")
public class GameParametersController {

    private IGameParametersService service = new GameParametersService();


    @RequestMapping(method = RequestMethod.GET)
//    public GameParameters getParams (@RequestBody Request request){
    public GameParameters getParams(@RequestBody String request) {
        return service.getParams(request);
    }
}


