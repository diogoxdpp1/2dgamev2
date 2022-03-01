package com.company.enemies;

public class enemyTemplate {


    public enemyTemplate(boolean isAlive, int maxHP, int currentHP, int ypos, int xpos, int points) {
        this.isAlive = isAlive;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.ypos = ypos;
        this.xpos = xpos;
        this.points = points;
    }

    public enemyTemplate() {
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
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

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    private boolean isAlive;
    private int maxHP = 3;
    private int currentHP;
    private int ypos;
    private int xpos;
    private int points;
}
