package com.company;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
                JFrame frame = new JFrame("My First GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300,300);
                JButton button = new JButton("Click me");
                frame.getContentPane().add(button); // Adds Button to content pane of frame
                frame.setVisible(true);
            }


            public static void printThing() {
                System.out.println("beans");
            }
}