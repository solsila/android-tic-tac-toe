package com.novoda.calisthenics.tictactoe;

public class Move {

    private final Player player;
    private final Position position;

    public Move(Player player, Position position) {
        this.player = player;
        this.position = position;
    }
}
