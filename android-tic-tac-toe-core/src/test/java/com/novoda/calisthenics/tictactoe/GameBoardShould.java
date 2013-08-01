package com.novoda.calisthenics.tictactoe;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class GameBoardShould {

    @Test
    public void beBlankAfterCreation() throws Exception {
        GameBoard board = new GameBoard();

        assertTrue(board.isBlank());
    }

    @Test
    public void acceptPlayerMove() throws Exception {
        GameBoard board = new GameBoard();

        board.acceptMove(new Player("Mike"), new Position(0));

        assertFalse(board.isBlank());
    }

//    @Test @Ignore("Not ready yet")
//    public void showTheBoardOnADisplay() throws Exception {
//        GameBoard board = new GameBoard();
//        board.display(null);
//    }
}
