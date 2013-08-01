package com.novoda.calisthenics.tictactoe;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class GameBoardShould {

    private GameBoard board = new GameBoard();

    @Test
    public void beBlankAfterCreation() throws Exception {
        assertTrue(board.isBlank());
    }

    @Test
    public void acceptPlayerMove() throws Exception {
        board.acceptMove(Player.CIRCLE, new Position(0));

        assertFalse(board.isBlank());
    }

//    @Test
//    public void notBeAbleToMoveInAPositionAlreadyTaken() throws Exception {
//
//
//    }

    //    @Test @Ignore("Not ready yet")
//    public void showTheBoardOnADisplay() throws Exception {
//        GameBoard board = new GameBoard();
//        board.display(null);
//    }
}
