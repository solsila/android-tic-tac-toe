package com.novoda.calisthenics.tictactoe;

import java.util.HashMap;
import java.util.Map;

public class GameBoard {

    Map<Position, Player> grid = new HashMap<Position, Player>();

    // What is this pattern called and why is it important?
    public void display(GameBoardDisplay display) {
        display.updateCell(null, null);
        display.updateCell(null, null);
        display.updateCell(null, null);
    }

    public boolean isBlank() {
        return grid.isEmpty();
    }

    public void acceptMove(Player player, Position position) {
        if (grid.containsKey(position)) {
            throw new IllegalMoveException();
        }
        grid.put(position, player);
    }
}
