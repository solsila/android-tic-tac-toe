package com.novoda.calisthenics.tictactoe;

public class Position {
    private final int position;

    public Position(int position) {
        this.position = position;

        if (position < 0 || position > 8) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position1 = (Position) o;

        if (position != position1.position) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return position;
    }
}
