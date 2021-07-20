package ru.job4j.chess.figures;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class BishopBlackTest {

    @Test
    public void moveBishopBlackС1toG5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertEquals(expected, bishopBlack.way(Cell.G5));
    }

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Assert.assertEquals(bishopBlack.position(), Cell.C1);
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = bishopBlack.copy(Cell.D2).position();
        Assert.assertEquals(expected, Cell.D2);
    }
}
