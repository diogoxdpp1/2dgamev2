package com.company.backEnd;

import javax.swing.*;
import java.awt.*;

public class menuGUI {

   static JFrame window;
   static Container con;

    public static void menu(){
        new menuGUI();
    }

    public static void menuGui(){

        window = new JFrame();
        window.setSize(768,576);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();
    }

}
