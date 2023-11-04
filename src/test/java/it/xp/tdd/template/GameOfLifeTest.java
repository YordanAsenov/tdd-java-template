package it.xp.tdd.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOfLifeTest {
    @Test
    void gameOfLifeExist() {
        GameOfLife gameOfLife = new GameOfLife();
        Assertions.assertNotNull(gameOfLife, "Game of Life should exist");
    }

    @Test
    void gridContainsNoAliveCell() {
        GameOfLife gameOfLife = new GameOfLife();
        Assertions.assertEquals(0, gameOfLife.getAliveCells(), "The grid shouldn't contain alive cells");
    }

    @Test
    void gridContainsOneAliveCell() {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.addCell(new Cell(0,0));
        Assertions.assertEquals(1, gameOfLife.getAliveCells(), "The grid should contain one alive cell");
    }

    @Test
    void gridContainsThreeAliveCells() {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.addCell(new Cell(0,0));
        gameOfLife.addCell(new Cell(0,-1));
        gameOfLife.addCell(new Cell(0,1));
        Assertions.assertEquals(3, gameOfLife.getAliveCells(),
        "The grid should contain three alive cells");
    }

    @Test
    void cellHasTwoNeighbours() {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.addCell(new Cell(0,0));
        gameOfLife.addCell(new Cell(0,-1));
        gameOfLife.addCell(new Cell(0,1));

        Assertions.assertEquals(2, gameOfLife.countCellNeighbours(0, 0),
        "The cell should have two neighbours");
    }
}
