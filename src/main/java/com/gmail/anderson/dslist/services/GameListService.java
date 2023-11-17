package com.gmail.anderson.dslist.services;

import com.gmail.anderson.dslist.DTO.GameListDto;
import com.gmail.anderson.dslist.entities.GameList;
import com.gmail.anderson.dslist.projections.GameMinProjection;
import com.gmail.anderson.dslist.repositories.GameListRepository;
import com.gmail.anderson.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository listRepository;
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public List<GameListDto> findByList(){
        List<GameList> result = listRepository.findAll();
        return result.stream().map(GameListDto::new).toList();
    }
    @Transactional(readOnly = true)
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            listRepository.updateBelongingPosition(listId, list.get(i).getId(), i);

        }

    }
}
