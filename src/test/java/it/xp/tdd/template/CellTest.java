package it.xp.tdd.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CellTest {
    @Test
    void cellExist() {
        Cell cell = new Cell();
        Assertions.assertNotNull(cell, "Cell should exist");
    }

    @Test
    void cellIsLocatedSomewhere() {
        Cell cell = new Cell(0, 0);
        Assertions.assertNotNull(cell.getLongitude(), "Cell longitude should be present");
        Assertions.assertNotNull(cell.getLatitude(), "Cell latitude should be present");
    }

    @Test
    void cellDiesAlone() {
        Cell cell = new Cell(0, 0);
        int neighbours = 1;
        Assertions.assertFalse(cell.lives(neighbours), "Cell should die alone");
    }

    @Test
    void cellLives() {
        Cell cell = new Cell(0, 0);
        int neighbours = 2;
        Assertions.assertTrue(cell.lives(neighbours), "Cell should live");
    }

    @Test
    void cellDies() {
        Cell cell = new Cell(0, 0);
        int neighbours = 4;
        Assertions.assertFalse(cell.lives(neighbours), "Cell should die");
    }
}
