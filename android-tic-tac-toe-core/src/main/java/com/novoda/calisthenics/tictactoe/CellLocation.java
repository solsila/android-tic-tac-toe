package com.novoda.calisthenics.tictactoe;

public class CellLocation implements Location {

    private final int rawLocationValue;

    public CellLocation(int rawLocationValue) {
        this.rawLocationValue = rawLocationValue;
    }

    @Override
    public void display() {
        System.out.println(rawLocationValue);
    }
}
