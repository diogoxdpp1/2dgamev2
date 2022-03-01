package com.company.frontEnd;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
        final int originalTileSize = 16;
        final int scale = 3;

        final int tileSize = originalTileSize * scale;
        final int maxScreenCol = 16;
        final int maxScreenRow = 12;
        final int screenWidth = tileSize * maxScreenCol;
        final int screenHeight = tileSize * maxScreenRow;
        final int FPS = 60;

        KeyHandler keyH = new KeyHandler();
        Thread gameThread;

    //  Set players default position
        int playerX = 100;
        int playerY = 430;
        int playerSpeed = 5;

        public GamePanel(){
            this.setPreferredSize(new Dimension(screenWidth, screenHeight));
            this.setBackground(Color.black);
            this.setDoubleBuffered(true);
            this.addKeyListener(keyH);
            this.setFocusable(true);
        }

        public void startGameThread(){

            gameThread = new Thread(this);
            gameThread.start();
        }

    @Override
    public void run() {

        while (gameThread != null){//runs 60 frames each second

            double drawInterval = 1000000000/FPS;// 0.01666 seconds
            double nextDrawTime = System.nanoTime() + drawInterval;


            long currentTime = System.nanoTime();
//            System.out.println("The game loop is running");
                update();// updates the GUI 60 times per second
                repaint();// repaints the sprite in the GUI 60 times per second

                try {
                    double remainingtime = nextDrawTime - System.nanoTime();
                    remainingtime = remainingtime/1000000;
                    if (remainingtime < 0){
                        remainingtime = 0;
                    }
                    Thread.sleep((long) remainingtime);

                    nextDrawTime+=drawInterval;
                } catch (InterruptedException e ) {
                    e.printStackTrace();
                }
        }

    }
    public void update(){

            if (keyH.rightPressed == true){
                playerX += playerSpeed;
            }  else if(keyH.leftPressed == true){
                playerX -= playerSpeed;
            }

    }
    public void paintComponent(Graphics g){

            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D)g;

            g2.setColor(Color.WHITE);
            g2.fillRect(playerX, playerY, tileSize, tileSize);
            g2.dispose();
    }
}
