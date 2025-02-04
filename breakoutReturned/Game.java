package breakoutReturned;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements ActionListener,MouseMotionListener {
    private boolean startGame = false;
    private double score = 0;
    private int totalBricks = 900;
    private Timer timer;
    private int delay = 8;
    static Point cursor = new Point(0, 0);

    private int ballPosX = 640;
    private int ballPosY = 650;
    private int ballXdir = -1;
    private int ballYdir = -2;

    public Game() {
        addMouseMotionListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }
    public void paint(Graphics g){
        //bg
        g.setColor(new Color(30, 30, 30));
        g.fillRect(0,0,1280,720);
        //borders
        g.setColor(new Color(64, 64, 64));
        g.fillRect(0,0,20,720);
        g.fillRect(1250,0,20,720);
        //paddle
        g.setColor(new Color(128, 128, 128));
        g.fillRect(cursor.x, 650, 100, 12);
        //ball
        g.setColor(new Color(93, 93, 93));
        g.fillOval(ballPosX, ballPosY, 20, 20);

        g.dispose();
    }
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        cursor.x = e.getX() - 40;
        if (cursor.x >= 200 && cursor.x < 1000) {
            repaint();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        startGame=true;
        if(startGame){
            if (new Rectangle(ballPosX, ballPosY,20,20).intersects(new Rectangle(cursor.x,650,100,12))){
                ballYdir = -ballYdir;
            }
            ballPosX += ballXdir;
            ballPosY += ballYdir;
            if(ballPosX < 0){
                ballXdir = -ballXdir;
            }
            if(ballPosY < 0){
                ballYdir = -ballYdir;
            }
            if(ballPosX > 1280){
                ballXdir = -ballXdir;
            }
        }
        repaint();
    }
}