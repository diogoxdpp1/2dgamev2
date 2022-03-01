package com.company.enemies;

public class normalEnemy extends enemyTemplate{
    public normalEnemy(boolean isAlive, int maxHP, int currentHP, int ypos, int xpos, int points) {
        super(isAlive, 1, currentHP, ypos, xpos, 100);
    }
}
