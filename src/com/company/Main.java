package com.company;
import com.company.frontEnd.GUI;
import com.company.frontEnd.GamePanel;

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
    public static void main(String[] args) throws IOException {
                JFrame frame = new JFrame("My First GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setTitle("2D Adventure");

                GamePanel gamePanel = new GamePanel();
                frame.add(gamePanel);;

                frame.pack();

                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                gamePanel.startGameThread();
            }
}