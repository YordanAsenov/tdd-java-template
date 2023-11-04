package it.xp.tdd.template;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cell {
    private Integer longitude;
    private Integer latitude;
    private boolean alive;
}
