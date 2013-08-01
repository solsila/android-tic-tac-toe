package com.novoda.calisthenics.tictactoe;

import java.util.HashMap;
import java.util.Map;

public class GameBoard {

    Map<Position, Symbol> grid = new HashMap<Position, Symbol>();

    public void display(GameBoardDisplay display) {
        for (int i = 0; i < 9; i++) {
            Position position = new Position(i);
            display.drawCell(position, symbolFor(position));
        }
    }

    private Symbol symbolFor(Position position) {
        if (grid.containsKey(position)) {
            return grid.get(position);
        }

        return Symbol.EMPTY;
    }

    public boolean isBlank() {
        return grid.isEmpty();
    }

    public void acceptMove(Symbol symbol, Position position) {
        if (grid.containsKey(position)) {
            throw new PositionAlreadyTakenException();
        }
        if (symbol == Symbol.EMPTY) {
            throw new NotAMoveSymbolException();
        }

        grid.put(position, symbol);
    }
}
