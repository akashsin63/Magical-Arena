package org.swiggy;
// Class representing the arena where players fight
public class ArenaPlayGround {
    private Player player1;
    private Player player2;
    private Dice dice;

    public ArenaPlayGround(Player player1, Player player2, Dice dice) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice;
    }
    // Method to perform an attack from one player to another
    private void performAttack(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;

        int damage = Math.max(attackDamage - defendStrength, 0);
        defender.reduceHealth(damage);

        System.out.printf("Attacker rolls: %d, Defender rolls: %d%n", attackRoll, defendRoll);
        System.out.printf("Damage: %d, Defender's new health: %d%n", damage, defender.getHealth());
    }
    // method to start the battle between players
    public void startBattle() {
        System.out.println("Battle starts!");
        while (player1.isAlive() && player2.isAlive()) {
            //player with less health will start attack
            if (player1.getHealth() < player2.getHealth()) {
                System.out.println("Player 1 attacks Player 2");
                performAttack(player1, player2);
                if (!player2.isAlive()) {
                    System.out.println("Player 2 has died. Player 1 wins!");
                    break;
                }
                System.out.println("Player 2 attacks Player 1");
                performAttack(player2, player1);
                if (!player1.isAlive()) {
                    System.out.println("Player 1 has died. Player 2 wins!");
                    break;
                }
            } else {
                System.out.println("Player 2 attacks Player 1");
                performAttack(player2, player1);
                if (!player1.isAlive()) {
                    System.out.println("Player 1 has died. Player 2 wins!");
                    break;
                }
                System.out.println("Player 1 attacks Player 2");
                performAttack(player1, player2);
                if (!player2.isAlive()) {
                    System.out.println("Player 2 has died. Player 1 wins!");
                    break;
                }
            }
        }
        System.out.println("Battle ends!");
    }
}
