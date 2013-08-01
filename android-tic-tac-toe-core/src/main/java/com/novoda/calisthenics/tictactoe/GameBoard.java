package com.novoda.calisthenics.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    List<Move> grid = new ArrayList<Move>();

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
        grid.add(new Move(player, position));
    }
}
