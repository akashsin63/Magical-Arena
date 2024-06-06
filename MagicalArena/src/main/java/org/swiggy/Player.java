package org.swiggy;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }
    public void takeDamage(int damage) {
        this.health = Math.max(this.health - damage, 0);
    }
    public int attack(Dice dice) {
        return attack * dice.roll();
    }

    public int defend(Dice dice) {
        return strength * dice.roll();
    }
    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", strength=" + strength +
                ", attack=" + attack +
                '}';
    }
}
