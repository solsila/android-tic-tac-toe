package com.novoda.calisthenics.tictactoe;

import com.novoda.calisthenics.tictactoe.presentation.CellDisplayer;
import com.novoda.calisthenics.tictactoe.presentation.GameBoardDisplay;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    private final GameBoardDisplay display;

    private List<Cell> cells;


    public GameBoard(GameBoardDisplay display) {
        this.display = display;
    }

    public void newGame() {
        cells = new ArrayList<Cell>();
        for (int i = 0; i < 9; i++) {
            cells.add(new TicTacToeCell(CellType.EMPTY));
        }
    }

    public void playMove(int position, Cell cell) {
        cells.set(position, cell);

        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            cells.get(i).display(new CellDisplayer());
        }
        System.out.println();
    }


//    -- x x x --
//    -- x x x --
//    -- x x x --

}
