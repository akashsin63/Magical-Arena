package org.swiggy;

public class Main {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(200, 10, 5);

        Dice dice = new Dice();

        // Create an arena with the two players and the dice
        ArenaPlayGround arena = new ArenaPlayGround(playerA, playerB, dice);

        // Start the battle
        arena.startBattle();
    }
}