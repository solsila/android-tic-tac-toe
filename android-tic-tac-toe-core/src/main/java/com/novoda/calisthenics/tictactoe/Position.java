package com.novoda.calisthenics.tictactoe;

public class Position {
    private final int position;

    public Position(int position) {
        this.position = position;

        if (position < 0 || position > 8) {
            throw new IllegalArgumentException();
        }
    }
}
