package it.xp.tdd.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cell {
    private Integer longitude;
    private Integer latitude;
    private boolean alive = true;

    public Cell(Integer longitude, Integer latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.alive = true;
    }

    private long countNeighbours(List<Cell> grid) {
        Cell topLeft = new Cell(this.longitude - 1, this.latitude + 1);
        Cell top = new Cell(this.longitude, this.latitude + 1);
        Cell topRight = new Cell(this.longitude + 1, this.latitude + 1);
        Cell left = new Cell(this.longitude - 1, this.latitude);
        Cell right = new Cell(this.longitude + 1, this.latitude);
        Cell bottomLeft = new Cell(this.longitude - 1, this.latitude - 1);
        Cell bottom = new Cell(this.longitude, this.latitude - 1);
        Cell bottomRight = new Cell(this.longitude + 1, this.latitude - 1);
        List<Cell> round = List.of(topLeft, top, topRight, left, right, bottomLeft, bottom, bottomRight);

        return grid.stream()
            .filter(round::contains)
            .filter(Cell::isAlive)
            .count();
    }

    public void evolve(List<Cell> grid) {
        long neighbours = countNeighbours(grid);

        if (!this.alive && neighbours == 3) {
            this.alive = true;
        }

        if (this.isAlive() && (neighbours < 2 || neighbours > 3)) {
            this.alive = false;
        }

        if (this.isAlive() && (neighbours == 2 || neighbours == 3)) {
            this.alive = true;
        }
    }
}
