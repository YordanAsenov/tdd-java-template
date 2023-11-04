package it.xp.tdd.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {
    @Test
    void cellIsLocatedSomewhere() {
        Cell cell = new Cell(0,0);
        assertNotNull(cell.getLongitude(), "Cell should has a longitude");
        assertNotNull(cell.getLatitude(), "Cell should has a latitude");
    }

    @Test
    void cellDiesWhenAlone() {
        List<Cell> grid = List.of();
        Cell cell = new Cell(0,0);
        cell.evolve(grid);
        Assertions.assertFalse(cell.isAlive(), "The cell should be dead");
    }

    @Test
    void cellStayAlive() {
        List<Cell> grid = List.of(
            new Cell(-1, 1),
            new Cell(0, 1)
        );
        Cell cell = new Cell(0,0);
        cell.evolve(grid);
        Assertions.assertTrue(cell.isAlive(), "The cell should be alive");
    }

    @Test
    void cellDies() {
        List<Cell> grid = List.of(
            new Cell(-1, 1),
            new Cell(0, 1),
            new Cell(1, 1),
            new Cell(-1, -1)
        );
        Cell cell = new Cell(0,0);
        cell.evolve(grid);
        Assertions.assertFalse(cell.isAlive(), "The cell should be dead");
    }

    @Test
    void deadCellBecameAlive() {
        List<Cell> grid = List.of(
            new Cell(-1, 1),
            new Cell(0, 1),
            new Cell(1, 1)
        );
        Cell cell = new Cell(0,0, false);
        cell.evolve(grid);
        Assertions.assertTrue(cell.isAlive(), "The cell should be dead");
    }

    @Test
    void firstPattern() {
        List<Cell> grid = List.of(
            new Cell(-1, 1, false),
            new Cell(0, 1),
            new Cell(1, 1, false),
            new Cell(-1, 0, false),
            new Cell(0, 0),
            new Cell(1, 0, false),
            new Cell(-1, -1, false),
            new Cell(0, -1),
            new Cell(1, -1, false)
        );
        GameOfLife gameOfLife = new GameOfLife(grid);
        gameOfLife.tick();

        List<Cell> expectedGrid = List.of(
                new Cell(-1, 1, false),
                new Cell(0, 1, false),
                new Cell(1, 1, false),
                new Cell(-1, 0),
                new Cell(0, 0),
                new Cell(1, 0),
                new Cell(-1, -1, false),
                new Cell(0, -1, false),
                new Cell(1, -1, false)
        );

        Assertions.assertEquals(expectedGrid, gameOfLife.getGrid(),
            "The grid should match the expected one");
    }
}
