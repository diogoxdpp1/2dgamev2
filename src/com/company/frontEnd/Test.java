package com.company.frontEnd;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Test {
    public static class Car extends JPanel {
        int x;
        int y;

        public Car(int x,int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLACK);
            g.fillRect(x, y, 20, 20);
        }

        public void move_right(){
            x=x+20;
        }

        public void move_left(){
            x=x-20;
        }

    }



    public static class Form extends JFrame {

        //private JPanel contentPane;
        Car car1;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Form frame = new Form();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        public Form() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 727, 550);
            getContentPane().setLayout(null);
            car1 = new Car(350, 480);
            addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    int key = e.getKeyCode();
                    if (key == KeyEvent.VK_LEFT) {
                        getGraphics().setColor(Color.WHITE);
                        car1.move_left();
                        car1.repaint();
                    }
                    if (key == KeyEvent.VK_RIGHT) {
                        car1.move_right();
                        car1.repaint();
                    }
                }
            });
            car1.setBounds(0, 0, 700, 500);
            car1.setBackground(new Color(0, 0, 0));
            getContentPane().add(car1);
        }

    }
}
