package com.gmail.anderson.dslist.controllers;

import com.gmail.anderson.dslist.DTO.GameListDto;
import com.gmail.anderson.dslist.services.GameListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService service;
    @GetMapping
    public List<GameListDto> findByLists(){
        List<GameListDto> result = service.findByList();
        return result;
    }

}
