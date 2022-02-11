package com.company;
import com.company.frontEnd.GUI;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
                JFrame frame = new JFrame("My First GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI GUI = new GUI(300, 300);
                frame.setSize(GUI.getGridHeight(), GUI.getGridLength());
                frame.setVisible(true);
            }

            aa

}