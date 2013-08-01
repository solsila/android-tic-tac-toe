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

    @Test(expected = PositionAlreadyTakenException.class)
    public void notBeAbleToMoveInAPositionAlreadyTaken() throws Exception {
        board.acceptMove(Symbol.CIRCLE, new Position(5));

        board.acceptMove(Symbol.CROSS, new Position(5));
    }

    @Test(expected = NotAMoveSymbolException.class)
    public void notBeAbleToPlayAnEmptySymbol() throws Exception {
        board.acceptMove(Symbol.EMPTY, new Position(5));
    }

    @Test
    public void displayAllEmptyCellsForABlankBoard() throws Exception {
        board.display(gameBoardDisplay);

        for (int i = 0; i < BOARD_SIZE; i++) {
            verify(gameBoardDisplay).drawCell(eq(new Position(i)), same(Symbol.EMPTY));
        }
    }

    @Test
    public void displayAcceptedMovesOnTheBoard() throws Exception {
        board.acceptMove(Symbol.CIRCLE, new Position(0));
        board.acceptMove(Symbol.CROSS, new Position(1));
        board.acceptMove(Symbol.CIRCLE, new Position(2));

        board.display(gameBoardDisplay);

        verify(gameBoardDisplay).drawCell(new Position(0), Symbol.CIRCLE);
        verify(gameBoardDisplay).drawCell(new Position(1), Symbol.CROSS);
        verify(gameBoardDisplay).drawCell(new Position(2), Symbol.CIRCLE);

        for (int i = 3; i < BOARD_SIZE; i++) {
            verify(gameBoardDisplay).drawCell(new Position(i), Symbol.EMPTY);
        }
    }
}
