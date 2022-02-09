package com.company.enemies;

public class normalEnemy extends enemyTemplate {

    private int xpos;
    private int ypos;
    private int currentHP;
    private int maxHP = 1;
    private boolean isAlive;

    public normalEnemy(int xpos, int ypos, int maxHP, boolean isAlive) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.maxHP = maxHP;
        this.isAlive = isAlive;
    }

    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}


