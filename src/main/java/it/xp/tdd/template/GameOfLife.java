package it.xp.tdd.template;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class GameOfLife {

    private final List<Cell> cells = new ArrayList<>();

    public long getAliveCells() {
        return cells.stream()
            .filter(Cell::isAlive)
            .count();
    }

    public void addCell(Cell cell) {
        this.cells.add(cell);
    }

    public long countCellNeighbours(int longitude, int latitude) {
        Cell topLeft = new Cell(longitude - 1, latitude + 1);
        Cell top = new Cell(longitude, latitude + 1);
        Cell topRight = new Cell(longitude + 1, latitude + 1);
        Cell left = new Cell(longitude - 1, latitude);
        Cell right = new Cell(longitude + 1, latitude);
        Cell bottomLeft = new Cell(longitude - 1, latitude - 1);
        Cell bottom = new Cell(longitude, latitude - 1);
        Cell bottomRight = new Cell(longitude + 1, latitude - 1);
        List<Cell> round = List.of(topLeft, top, topRight, left, right, bottomLeft, bottom, bottomRight);

        return cells.stream()
            .filter(round::contains)
            .count();
    }
}
