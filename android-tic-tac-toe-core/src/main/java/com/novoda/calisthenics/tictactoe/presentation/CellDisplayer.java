package com.novoda.calisthenics.tictactoe.presentation;

import com.novoda.calisthenics.tictactoe.Cell;
import com.novoda.calisthenics.tictactoe.CellType;

import java.util.ArrayList;
import java.util.List;

public class CellDisplayer {

    public void display(CellType type) {
        System.out.print(" " + type + " ");
    }
}
