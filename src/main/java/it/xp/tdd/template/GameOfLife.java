package it.xp.tdd.template;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class GameOfLife {
    private List<Cell> grid;

    public void tick() {
        List<Cell> newGrid = new ArrayList<>();

        for (Cell cell : grid) {
            long neighbours = grid.stream()
                .filter(c -> c != cell)
                .count();
            if (neighbours >= 1) {
                newGrid.add(cell);
            }
        }

        this.grid = newGrid;
    }
}
