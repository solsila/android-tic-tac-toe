package com.novoda.calisthenics.tictactoe;

public enum CellType {
    EMPTY("-"),
    CIRCLE("o"),
    CROSS("x");

    private final String label;

    CellType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
