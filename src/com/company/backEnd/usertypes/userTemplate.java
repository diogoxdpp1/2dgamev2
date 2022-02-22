package com.company.backEnd.usertypes;

public class userTemplate {
    public userTemplate(String username, String email, String password, int highscore) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.highscore = highscore;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    private String email;
    private String password;
    private int highscore;
}
