package com.gmail.anderson.dslist.services;

import com.gmail.anderson.dslist.DTO.GameListDto;
import com.gmail.anderson.dslist.entities.GameList;
import com.gmail.anderson.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    GameListRepository listRepository;
    @Transactional(readOnly = true)
    public List<GameListDto> findByList(){
        List<GameList> result = listRepository.findAll();
        return result.stream().map(GameListDto::new).toList();
    }
}
