package it.xp.tdd.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cell {
    private Integer longitude;
    private Integer latitude;
    private boolean alive;

    public Cell(Integer longitude, Integer latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.alive = true;
    }

    public boolean lives(int neighbours) {
        if (neighbours < 2) {
            return false;
        }
        return neighbours == 2 || neighbours == 3;
    }
}
