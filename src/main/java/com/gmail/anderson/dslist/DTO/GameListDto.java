package com.gmail.anderson.dslist.DTO;

import com.gmail.anderson.dslist.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Setter
@Getter
public class GameListDto {
    private Long id;
    private String name;

    public GameListDto(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
