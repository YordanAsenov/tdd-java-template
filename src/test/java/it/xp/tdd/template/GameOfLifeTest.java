package it.xp.tdd.template;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GameOfLifeTest {

    @Test
    void gameOfLifeExist() {
        GameOfLife gameOfLife = new GameOfLife();
        assertNotNull(gameOfLife, "Game of Life should exist");
    }

    @Test
    void gridIsEmpty() {
        GameOfLife gameOfLife = new GameOfLife();
        List<Cell> aliveCells = gameOfLife.getAliveCells();
        assertEquals(0, aliveCells.size(), "Grid should be empty");
    }

    @Test
    void gridContainsAnAliveCell() {
        GameOfLife gameOfLife = new GameOfLife();
        Cell cell = new Cell();
        gameOfLife.addCell(cell);

        List<Cell> aliveCells = gameOfLife.getAliveCells();
        assertEquals(1, aliveCells.size(), "Grid should contain one alive cell");
    }

    @Test
    void gridContainsThreeAliveCells() {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.addCell(new Cell(0,0));
        gameOfLife.addCell(new Cell(0,1));
        gameOfLife.addCell(new Cell(0,-1));

        List<Cell> aliveCells = gameOfLife.getAliveCells();
        assertEquals(3, aliveCells.size(), "Grid should contain three alive cells");
    }

    @Test
    void countCellNeighbours() {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.addCell(new Cell(0,0));
        gameOfLife.addCell(new Cell(0,1));
        gameOfLife.addCell(new Cell(0,-1));

        Integer neighbours = gameOfLife.countCellNeighbours(0, 0);
        assertEquals(2, neighbours, "Cell should have two neighbours");
    }
}
