package com.novoda.calisthenics.tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameBoardShould {

    public static final int GRID_SIZE = 9;
    @Mock
    GameBoardDisplay gameBoardDisplay;


    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void show_the_board_on_a_display() throws Exception {
        GameBoard board = new GameBoard();
        board.display(gameBoardDisplay);

        verify(gameBoardDisplay, times(GRID_SIZE)).displayCell(any(Location.class), any(Player.class));
    }

}
