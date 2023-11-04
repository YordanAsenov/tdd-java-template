package it.xp.tdd.template;

class GameOfLife {
    private boolean[][] grid;

    public GameOfLife(boolean[][] grid) {
        this.grid = grid;
    }

    public void tick() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int neighbours = countCellNeighbours(i, j, grid);
            }
        }
    }

    private int countCellNeighbours(int rowIndex, int columnIndex, boolean[][] grid) {
        int neighbours = 0;

        if (rowIndex - 1 > 0 && columnIndex - 1 > 0) {
            if (grid[rowIndex - 1][columnIndex - 1]) {
                neighbours++;
            }
        }

        return neighbours;
    }
}
