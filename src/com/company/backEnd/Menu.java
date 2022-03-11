//TO DO !
// replace console input with GUIs
// sort out user verifs w/ Aidan



package com.company.backEnd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.company.backEnd.user;

import javax.swing.*;

public class Menu {

    //the location of the access database
    private static final String DatabaseLocation = System.getProperty("user.dir") + "\\2DGame Database.accdb";

    //Connects to the access database
    public static Connection getConnection() {

        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            return con;
        } catch (Exception e) {
            System.out.println("Error in database connection" + e);
        }
        return null;
    }

    public static ResultSet executeQuery(Connection con, String query) {

        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(query);

            return rs;
        } catch (Exception e) {
            System.out.println("Error in the ExecuteSQL class:" + e);
            return null;
        }
    }

    public static void executeUpdateQuery(Connection con, String query) {
        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.executeUpdate(query);

        } catch (Exception e) {
            System.out.println("Error in the ExecuteSQL class:" + e);
        }
    }

    public static void guiMenu() {
        JFrame menu = new JFrame();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
        menu.setTitle("Face Invaders");

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static boolean isGuest = false;
    public static boolean loggedIn = true;

    public static void startScreen() {
        switch (getInput("would you like to log in,create account or play as a guest?")) {
            case ("log in "):
                playerLogin();
                playerMenu();
                break;

            case ("create account"):
                createAccount();
                playerMenu();
                break;

            case ("play as guest"):
                guestMenu();
                break;
        }
    }

    public static void guestMenu() {
        while (loggedIn) {
            isGuest = true;
            switch (getInput("would you like to play, see the leaderboard or log off?")) {

                case ("play"):
                    playGame();
                    break;

                case ("leaderboard"):
                    viewLeaderboard();
                    break;

                case ("log off"):
                    loggedIn = false;
                    break;
            }
        }
    }

    public static void playerMenu() {
        while (loggedIn) {
            switch (getInput("would you like to play , see the leaderboard , check out the extras or log off?")) {

                case ("play"):
                    playGame();
                    break;

                case ("leaderboard"):
                    viewLeaderboard();
                    break;


                case ("extras"):
                    extras();
                    break;

                case ("log off"):
                    loggedIn = false;
                    break;
            }
        }
    }

    public static void playGame() {
    }

    ;

    public static void viewLeaderboard() {
    }

    ;

    public static void extras() {
    }

    ;


    //creates account and sends the details off to be stored in the database
    public static void createAccount() {
        user accountDetails = new user(getInput("please enter a username"), getEmail(), getPassword(), 0);

        try {
            String sql = "INSERT INTO Users, VALUES'" + accountDetails;
            Connection con = getConnection();
            ResultSet rs = executeQuery(con, sql);

            if (rs.next()) {
                rs.insertRow();
            }
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("error with creating account" + e);
        }
    }

    //gets the emails and checks if it
    public static String getEmail() {
        while (true) {
            String emailInput = getInput("please enter a valid email");
            if (emailInput.contains("@") && emailInput.contains(".com")) {
                return emailInput;
            } else {
                System.out.println("that is not a valid email, please try again");
            }
        }
    }

    public static String getPassword() {

        Pattern validPassword = Pattern.compile("(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8,}");

        while (true) {
            String passwordInput = getInput("please enter a secure password, it must have 1 uppercase letter, 1 special character, and be at least 8 letters long");
            Matcher matcher = validPassword.matcher(passwordInput);
            if (matcher.matches()) {
                return passwordInput;
            } else {
                System.out.println("that is not a secure enough password, please try again");
            }
        }
    }

    public static void playerLogin() {
        boolean loggedIn = false;
        while (!loggedIn) {
            String emailInput = getInput("please enter a valid email");
            String passwordInput = getInput("please enter the password for this account");

            //verification stuff goes here Aidan
            try {
                String sql = "SELECT * FROM Users where Email = '" + emailInput + "AND password = '" + passwordInput;
                Connection con = getConnection();
                ResultSet rs = executeQuery(con, sql);

                if (rs.next())
                    (rs.getLong("UserName"),(rs.getLong("password"));


            } catch (Exception e) {
                System.out.println("Error logging in" + e);
            }


                if (loggedIn) {
                    break;
                } else {
                    System.out.println("your input does not match our database, please try again");
                }

            }
        }
    }

