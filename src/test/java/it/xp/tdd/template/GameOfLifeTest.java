package it.xp.tdd.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GameOfLifeTest {

    @Test
    void cellShouldDieWhenAlone() {
        GameOfLife gameOfLife = new GameOfLife(List.of(
            new Cell(0, 0)
        ));

        gameOfLife.tick();

        List<Cell> expected = List.of();
        Assertions.assertEquals(expected, gameOfLife.getGrid(),
        "The grid should match the expected one");
    }

    @Test
    void cellShouldSurviveWithThreeAliveNeighbours() {
        GameOfLife gameOfLife = new GameOfLife(List.of(
            new Cell(0, 0),
            new Cell(0, 1),
            new Cell(1, 0),
            new Cell(1, 1)
        ));

        gameOfLife.tick();

        List<Cell> expected = List.of(
            new Cell(0, 0),
            new Cell(0, 1),
            new Cell(1, 0),
            new Cell(1, 1)
        );
        Assertions.assertEquals(expected, gameOfLife.getGrid(),
        "The grid should match the expected one");
    }

    @Test
    void aliveNeighbours() {
        GameOfLife gameOfLife = new GameOfLife(List.of(
            new Cell(0, 0),
            new Cell(0, 1),
            new Cell(1, 0),
            new Cell(1, 1)
        ));

        Neighbourhood neighbourhood = Neighbourhood.of(0, 0, gameOfLife.getGrid());
        Integer neighbours = neighbourhood.getCount();

        Assertions.assertEquals(3, neighbours);
    }
}
