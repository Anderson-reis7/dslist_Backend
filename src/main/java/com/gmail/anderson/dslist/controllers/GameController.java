package com.gmail.anderson.dslist.controllers;

import com.gmail.anderson.dslist.entities.Game;
import com.gmail.anderson.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService service;
    @GetMapping
    public List<Game> findAll(){
        List<Game> result = service.findAll();
        return result;
    }
}
