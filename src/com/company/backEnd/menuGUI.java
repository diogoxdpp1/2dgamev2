package com.company.backEnd;

import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.Font;
public class menuGUI {

    static JFrame window;
    static Container con;
    static JPanel titlePanel;
    static JLabel title;
    static Font titlefont = new Font("Times New Roman",Font.PLAIN,50);
    public static void menu() {
        new menuGUI();
    }

    public static void menuGui() {

        window = new JFrame();
        window.setSize(768, 576);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();
        window.setTitle("Menu");

        titlePanel = new JPanel();
        titlePanel.setBounds(192, 96, 384, 192);
        titlePanel.setBackground(Color.white);
        con.add(titlePanel);


        title = new JLabel("Face Invaders!");
        title.setForeground(Color.red);
        title.setFont(titlefont);
        titlePanel.add(title);

    }

}
