package com.gmail.anderson.dslist.repositories;

import com.gmail.anderson.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
