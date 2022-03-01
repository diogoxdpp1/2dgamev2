package com.company.backEnd;

public class player {
    private int currentHP;
    private int maxHP = 3;
    private int xpos;
    private int ypos;
    private boolean isAlive;
    private String playerName;
    private int playerScore;

    public player(int currentHP, int maxHP, int xpos, int ypos, boolean isAlive, String playerName,int playerScore) {
        this.currentHP = currentHP;
        this.maxHP = maxHP;
        this.xpos = xpos;
        this.ypos = ypos;
        this.isAlive = isAlive;
        this.playerName = playerName;
        this.playerScore = playerScore;
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

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return playerScore;
    }

    public void setScore(int score) {
        this.playerScore = score;
    }
}
