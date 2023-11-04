package it.xp.tdd.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CellTest {
    @Test
    void cellExist() {
        Cell cell = new Cell();
        assertNotNull(cell, "Cell should exist");
    }

    @Test
    void cellIsLocatedSomewhere() {
        Cell cell = new Cell(0,0);
        assertNotNull(cell.getLongitude(), "Cell longitude should be present");
        assertNotNull(cell.getLatitude(), "Cell latitude should be present");
    }
}
