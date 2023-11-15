package com.gmail.anderson.dslist.controllers;

import com.gmail.anderson.dslist.DTO.GameDto;
import com.gmail.anderson.dslist.DTO.GameMinDTO;
import com.gmail.anderson.dslist.entities.Game;
import com.gmail.anderson.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService service;
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = service.findAll();
        return result;
    }
    @GetMapping("/{id}")
    public GameDto findById(@PathVariable Long id){
        GameDto result = service.findById(id);
        return result;
    }
}
