package com.novoda.calisthenics.tictactoe.presentation;

import com.novoda.calisthenics.tictactoe.Cell;

public class TicTacToeGameBoardDisplay implements GameBoardDisplay {

    private final CellDisplayer cellDisplayer;

    public TicTacToeGameBoardDisplay(CellDisplayer cellDisplayer) {
        this.cellDisplayer = cellDisplayer;
    }

    @Override
    public void displayCell(Cell cell) {
        cell.display(cellDisplayer);
    }
}
