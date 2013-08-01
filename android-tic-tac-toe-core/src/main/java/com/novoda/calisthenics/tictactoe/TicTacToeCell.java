package com.novoda.calisthenics.tictactoe;

import com.novoda.calisthenics.tictactoe.presentation.CellDisplayer;

public class TicTacToeCell implements Cell {

    private final CellType type;

    public TicTacToeCell(CellType type) {
        this.type = type;
    }

    @Override
    public void display(CellDisplayer cellDisplayer) {
        cellDisplayer.display(type);
    }

}
