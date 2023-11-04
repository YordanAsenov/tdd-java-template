package it.xp.tdd.template;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {
    List<Cell> aliveCells = new ArrayList<>();

    public void addCell(Cell cell) {
        aliveCells.add(cell);
    }

    public List<Cell> getAliveCells() {
        return aliveCells;
    }

    public Integer countCellNeighbours(int longitude, int latitude) {
        Cell upperLeft = new Cell(longitude - 1, latitude + 1);
        Cell top = new Cell(longitude, latitude + 1);
        Cell upperRight = new Cell(longitude + 1, latitude + 1);
        Cell left = new Cell(longitude - 1, latitude);
        Cell right = new Cell(longitude + 1, latitude);
        Cell bottomLeft = new Cell(longitude - 1, latitude - 1);
        Cell bottom = new Cell(longitude, latitude - 1);
        Cell bottomRight = new Cell(longitude + 1, latitude - 1);
        List<Cell> round = List.of(upperLeft, top, upperRight, left, right, bottomLeft, bottom, bottomRight);
        return round.size();
    }
}
