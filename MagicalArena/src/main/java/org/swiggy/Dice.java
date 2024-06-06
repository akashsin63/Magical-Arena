package org.swiggy;

import java.util.Random;

public class Dice {
    private static final int SIDES = 6;
    private Random random;

    public Dice() {
        random = new Random();
    }
    // Roll the dice and return a number between 1 and 6
    public int roll() {
        return random.nextInt(SIDES) + 1;
    }
}
