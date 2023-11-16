package com.gmail.anderson.dslist.controllers;

import com.gmail.anderson.dslist.DTO.GameListDto;
import com.gmail.anderson.dslist.DTO.GameMinDTO;
import com.gmail.anderson.dslist.services.GameListService;

import com.gmail.anderson.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService service;
    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDto> findByLists(){
        List<GameListDto> result = service.findByList();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByLists(listId);
        return result;
    }

}
