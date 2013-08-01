package com.novoda.calisthenics.tictactoe;

import com.novoda.calisthenics.tictactoe.presentation.CellDisplayer;
import com.novoda.calisthenics.tictactoe.presentation.GameBoardDisplay;
import com.novoda.calisthenics.tictactoe.presentation.TicTacToeGameBoardDisplay;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameBoardDisplayShould {

    @Mock
    CellLocation cellLocation;

    @Mock
    Player player;

    private GameBoardDisplay gameBoardDisplay;

    @Before
    public void setUp() throws Exception {
        initMocks(this);

        gameBoardDisplay = new TicTacToeGameBoardDisplay(new CellDisplayer());
    }

    @Test
    public void display_location_for_cell() throws Exception {
        //gameBoardDisplay.displayCell(cellLocation, null);

        verify(cellLocation).display();
    }

//    @Test
//    public void display_player_for_cell() throws Exception {
//        gameBoardDisplay.displayCell(cellLocation, player);
//
//        verify(player).display();
//    }

}
