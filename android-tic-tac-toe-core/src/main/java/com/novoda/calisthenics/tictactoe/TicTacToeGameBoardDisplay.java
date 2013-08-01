package com.novoda.calisthenics.tictactoe;

public class TicTacToeGameBoardDisplay implements GameBoardDisplay {

    @Override
    public void displayCell(Location location, Player player) {
        location.display();
    }
}
