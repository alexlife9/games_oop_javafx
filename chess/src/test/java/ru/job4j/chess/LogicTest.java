package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void moveBishopBlackС1toH6()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test
    public void moveBishopBlackС1toG5() {
        Figure bishopBlack = new BishopBlack(Cell.C1); //создаем объект с начальным положением C1
        Cell[] cells = bishopBlack.way(Cell.G5); // вызываем метод way G5
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}; //возвращаем массив
        Assert.assertEquals(cells, expected); //сравниваем желаемое с полученным
    }
}