package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int size = ...;
        Cell[] steps = new Cell[size];
        int x = position.getX();
        int y = position.getY();
        int deltaX = position.getX() - dest.getX();
        int deltaY = position.getY() - dest.getY();
        for (int index = 0; index < size; index++) {
            x = deltaX + 1;
            y = deltaY + 1;
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        /* TODO check diagonal */
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
