package com.company.enemies;

public class Boss extends enemyTemplate{
    public Boss(boolean isAlive, int maxHP, int currentHP, int ypos, int xpos, int points) {
        super(isAlive, 10, currentHP, ypos, xpos, 1000);
    }
}
