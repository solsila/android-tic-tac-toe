package com.novoda.calisthenics.tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameBoardDisplayShould {

    @Mock
    CellLocation cellLocation;

    private GameBoardDisplay gameBoardDisplay;

    @Before
    public void setUp() throws Exception {
        initMocks(this);

        gameBoardDisplay = new TicTacToeGameBoardDisplay();
    }

    @Test
    public void display_location_for_cell() throws Exception {
        gameBoardDisplay.displayCell(cellLocation, null);

        verify(cellLocation).display();
    }

}
