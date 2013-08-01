package com.novoda.calisthenics.tictactoe;

import org.junit.Test;

public class PositionShould {

    @Test
    public void exist() throws Exception {
        new Position(6);
    }

    @Test(expected = Exception.class)
    public void havePositionGreaterThanZero() throws Exception {
        new Position(-1);
    }

    @Test(expected = Exception.class)
    public void havePositionLowerThanEight() throws Exception {
        new Position(10);
    }

}
