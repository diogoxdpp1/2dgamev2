//TO DO !
// replace console input with GUIs
// sort out user verifs w/ Aidan



package com.company.backEnd;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.company.backEnd.user;
public class Menu {

    private static final String DatabaseLocation = System.getProperty("user.dir") + "\\2DGame Database.accdb";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
        } catch (Exception e) {
            System.out.println("Error in database connection" + e);
        }
        return null;
    }



    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static boolean isGuest = false;
    public static boolean loggedIn = true;

    public static void startScreen(){
         switch(getInput("would you like to log in,create account or play as a guest?")){
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

                case("leaderboard"):
                    viewLeaderboard();
                    break;

                case("log off"):
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
    public static void playGame(){};

    public static void viewLeaderboard(){
    };

    public static void extras(){};

    public static void createAccount(){
        new user(getInput("please enter a username"),getEmail(),getPassword(),0);

        String query = "INSERT INTO Users(UserName, password, Email) VALUES" + ();

        try (Statement stmt = getConnection().createStatement()){

            ResultSet rs = stmt.executeQuery(query);

        }catch (SQLException e){
            System.out.println("Problem with SQL query" + e);
        }


    }



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

                if (loggedIn) {
                    break;
                } else {
                    System.out.println("your input does not match our database, please try again");
                }

            }
        }
    }
