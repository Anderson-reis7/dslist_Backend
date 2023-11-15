package com.gmail.anderson.dslist.DTO;

import com.gmail.anderson.dslist.entities.Game;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
@Getter
@Setter
public class GameDto {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDto(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
