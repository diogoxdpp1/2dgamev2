package com.company.enemies;

public class hardEnemy extends enemyTemplate {
    public hardEnemy(boolean isAlive, int maxHP, int currentHP, int ypos, int xpos, int points) {
        super(isAlive, 3, currentHP, ypos, xpos, 300);
    }
}

