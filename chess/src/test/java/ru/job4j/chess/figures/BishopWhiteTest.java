package ru.job4j.chess.figures;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.white.BishopWhite;

public class BishopWhiteTest {

    @Test
    public void moveBishopWhiteС8toG4() {
        Figure bishopWhite = new BishopWhite(Cell.C8);
        Cell[] expected = new Cell[]{Cell.D7, Cell.E6, Cell.F5, Cell.G4};
        Assert.assertEquals(expected, bishopWhite.way(Cell.G4));
    }

    @Test
    public void testPosition() {
        BishopWhite bishopWhite = new BishopWhite(Cell.C8);
        Assert.assertEquals(bishopWhite.position(), Cell.C8);
    }

    @Test
    public void testCopy() {
        BishopWhite bishopWhite = new BishopWhite(Cell.C8);
        Cell expected = bishopWhite.copy(Cell.D7).position();
        Assert.assertEquals(expected, Cell.D7);
    }
}