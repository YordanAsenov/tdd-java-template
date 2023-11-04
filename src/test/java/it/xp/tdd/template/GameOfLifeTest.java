package it.xp.tdd.template;

import org.junit.jupiter.api.Test;

class GameOfLifeTest {
    @Test
    void gridContainsCells() {

        boolean[][] grid = new boolean[3][3];
        grid[0][0] = false;
        grid[0][1] = true;
        grid[0][2] = false;

        grid[1][0] = false;
        grid[1][1] = true;
        grid[1][2] = false;

        grid[2][0] = false;
        grid[2][1] = true;
        grid[2][2] = false;

        GameOfLife gameOfLife = new GameOfLife(grid);

        boolean[][] expectedGrid = new boolean[3][3];
        grid[0][0] = false;
        grid[0][1] = false;
        grid[0][2] = false;

        grid[1][0] = true;
        grid[1][1] = true;
        grid[1][2] = true;

        grid[2][0] = false;
        grid[2][1] = false;
        grid[2][2] = false;

    }
}
