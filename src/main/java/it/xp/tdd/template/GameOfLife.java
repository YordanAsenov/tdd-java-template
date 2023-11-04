package it.xp.tdd.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameOfLife {
    private List<Cell> grid;

    public void tick() {
        ArrayList<Cell> snapshot = new ArrayList<>();
        snapshot.addAll(grid);

        for (Cell cell : grid) {
            cell.evolve(snapshot);
        }
    }
}
