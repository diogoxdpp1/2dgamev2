package com.company.enemies;

public class enemyTemplate {

    private int Xpos;
    private int Ypos;
    private  String eName;
    private int maxHP;
    private int currentHP;
    private boolean isAlive;

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getXpos() {
        return Xpos;
    }

    public void setXpos(int xpos) {
        Xpos = xpos;
    }

    public int getYpos() {
        return Ypos;
    }

    public void setYpos(int ypos) {
        Ypos = ypos;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public enemyTemplate(int xpos, int ypos, String eName, int maxHP, int currentHP,boolean isAlive) {
        this.Xpos = xpos;
        this.Ypos = ypos;
        this.eName = eName;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.isAlive = isAlive;
    }
}
