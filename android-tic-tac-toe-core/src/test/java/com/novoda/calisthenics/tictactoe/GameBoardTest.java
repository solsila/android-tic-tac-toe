package com.novoda.calisthenics.tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameBoardTest {

    @Mock
    GameBoardDisplay gameBoardDisplay;


    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void showTheBoardOnADisplay() throws Exception {
        GameBoard board = new GameBoard();
        board.display(gameBoardDisplay);
        
        verify(gameBoardDisplay, atLeastOnce()).updateCell(any(Location.class), any(Player.class));
    }

}
