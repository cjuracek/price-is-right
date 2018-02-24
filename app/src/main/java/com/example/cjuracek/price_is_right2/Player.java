package com.example.cjuracek.price_is_right2;

/**
 * Created by cjuracek on 2/24/18.
 */

public class Player {
    private String userName;
    private double guess;

    public Player(String userName) {
        this.userName = userName;
    }

    public void setGuess(double g) {
        guess = g;
    }

    public double getGuess() {
        return guess;
    }


}
