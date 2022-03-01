package com.company.backEnd;

import java.util.Scanner;

public class Menu {

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static boolean loggedIn = true;

    public static void guestMenu() {
        while (loggedIn) {
            switch () {

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
            switch () {

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

}