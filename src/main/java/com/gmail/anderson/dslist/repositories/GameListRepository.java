package com.gmail.anderson.dslist.repositories;

import com.gmail.anderson.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
