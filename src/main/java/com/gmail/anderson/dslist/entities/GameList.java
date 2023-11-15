package com.gmail.anderson.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_game_list")
public class GameList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameList gameList)) return false;
        return Objects.equals(getId(), gameList.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
