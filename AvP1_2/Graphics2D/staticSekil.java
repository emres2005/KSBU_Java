package Graphics2D;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class staticSekil extends JPanel {
    Random rand = new Random();
    private Color randColor(){
        return new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
    }
    Color renk0 = randColor();
    Color renk1 = randColor();
    Color renk2 = randColor();
    Color renk3 = randColor();
    Color renk4 = randColor();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(renk0);
        g.fillRect(10, 10, 180, 135);
        g.setColor(renk1);
        g.fillOval(70, 150, 120, 120);
        g.setColor(renk2);
        g.fillOval(200, 120, 180, 120);
        g.setColor(renk3);
        g.fillRect(400, 20, 150, 150);
        g.setColor(renk4);
        g.fillArc(380,240,200,120,60,120);
        g.setColor(new Color(245, 130, 31));
        g.fillArc(300,400,150,150,90,270);
        g.setColor(new Color(0,0,0));
        g.setFont(new Font("Arial",Font.BOLD,70));
        g.drawString("ÖSYM",380,460);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.add(new staticSekil());
    }
}