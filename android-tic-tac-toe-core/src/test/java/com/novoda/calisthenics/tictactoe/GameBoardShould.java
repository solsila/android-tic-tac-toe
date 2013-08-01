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

    @Test(expected = IllegalMoveException.class)
    public void notBeAbleToMoveInAPositionAlreadyTaken() throws Exception {
        board.acceptMove(Player.CIRCLE, new Position(5));

        board.acceptMove(Player.CROSS, new Position(5));
    }

    //    @Test @Ignore("Not ready yet")
//    public void showTheBoardOnADisplay() throws Exception {
//        GameBoard board = new GameBoard();
//        board.display(null);
//    }
}
