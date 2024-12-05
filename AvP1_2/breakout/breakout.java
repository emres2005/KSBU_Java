package breakout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class breakout extends JPanel implements MouseListener, MouseMotionListener {
    public breakout() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.BLACK);
        bricks = new ArrayList<>();
    }

    static Point cursor = new Point(0, 0);
    static String lvlName;
    private static final int brickW = 45;
    private static final int brickH = 20;
    ArrayList<Rectangle> bricks;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Rectangle brick : bricks) {
            g.setColor(new Color(101, 0, 0));
            g.fillRect(brick.x, brick.y, brickW, brickH);
            g.setColor(new Color(135, 95, 95));
            g.drawRect(brick.x, brick.y + 1, brickW - 1, brickH - 2);
            g.setColor(new Color(0, 0, 0));
            g.drawLine(brick.x, brick.y, (brick.x + brickW), (brick.y + brickH));
            g.drawLine(brick.x, (brick.y + brickH), (brick.x + brickW), brick.y);
            g.drawRect((brick.x + 7), (brick.y + 3), (brickW - 13), (brickH - 6));
            g.setColor(new Color(121, 0, 0));
            g.fillRect((brick.x + 8), (brick.y + 4), (brickW - 14), (brickH - 7));
        }
        g.setColor(Color.gray);
        g.fillRect(0, -10, 10, 720);
        g.fillRect(1250, -10, 10, 720);
        g.setColor(new Color(0, 171, 197));
        g.fillRect(cursor.x, 640, 80, 15);
        g.setColor(new Color(0, 0, 255));
        g.drawRect(cursor.x, 640, 80, 15);
        g.setColor(new Color(115, 115, 115));
        g.fillOval(cursor.x+30, 600, 20, 20);
        g.setColor(new Color(255, 255, 255));
        g.drawArc(cursor.x+32, 604,10,10,90,130);
        //g.fillOval(cursor.x+4, 604, 7, 7);
    }

    void level1() {
        lvlName = "Level 1";
        int rows = 26;
        int cols = 22;
        int padding = 2;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = 20 + i * (brickW + padding);
                int y = 10 + j * (brickH + padding);
                bricks.add(new Rectangle(x, y, brickW, brickH));
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            breakout panel = new breakout();
            panel.level1();
            JFrame frame = new JFrame("DX-Ball 3: " + lvlName);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1280, 720);
            frame.setLocationRelativeTo(null);
            frame.add(panel);
            frame.setResizable(false);
        });
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        cursor.x = e.getX() - 40;
        if (cursor.x >= 10 && cursor.x < 1170) {
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        cursor.x = e.getX() - 40;
        if (cursor.x >= 10 && cursor.x < 1170) {
            repaint();
        }
    }
}