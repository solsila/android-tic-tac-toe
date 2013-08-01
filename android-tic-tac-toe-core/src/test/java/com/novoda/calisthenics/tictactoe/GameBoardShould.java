package com.novoda.calisthenics.tictactoe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GameBoardShould {

    public static final int BOARD_SIZE = 9;
    @Mock
    GameBoardDisplay gameBoardDisplay;

    GameBoard board = new GameBoard();

    @Test
    public void beBlankAfterCreation() throws Exception {
        assertTrue(board.isBlank());
    }

    @Test
    public void acceptPlayerMove() throws Exception {
        board.acceptMove(Symbol.CIRCLE, new Position(0));

        assertFalse(board.isBlank());
    }

    @Test(expected = IllegalMoveException.class)
    public void notBeAbleToMoveInAPositionAlreadyTaken() throws Exception {
        board.acceptMove(Symbol.CIRCLE, new Position(5));

        board.acceptMove(Symbol.CROSS, new Position(5));
    }

    @Test
    public void diplayAllEmptyCellsForABlankBoard() throws Exception {
        board.display(gameBoardDisplay);

        for (int i = 0; i < BOARD_SIZE; i++) {
            verify(gameBoardDisplay).drawCell(eq(new Position(i)), same(Symbol.EMPTY));
        }
    }
}
