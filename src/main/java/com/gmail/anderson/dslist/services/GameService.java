package com.gmail.anderson.dslist.services;


import com.gmail.anderson.dslist.entities.Game;
import com.gmail.anderson.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
