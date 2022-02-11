package com.company;
import com.company.frontEnd.GUI;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
                JFrame frame = new JFrame("My First GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI GUI = new GUI(300, 300);
                BufferedImage myPicture = ImageIO.read(new File("path-to-file"));
                JLabel picLabel = new JLabel(new ImageIcon(myPicture));
                frame.setIconImage(picLabel);
                frame.setSize(GUI.getGridHeight(), GUI.getGridLength());
                frame.setVisible(true);
            }
}