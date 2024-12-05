package Graphics2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dynamicSekil extends JPanel implements MouseListener, MouseMotionListener {
    Point startP;
    Point endP;
    static char s;
    public dynamicSekil() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        switch(s) {
            case 'r':
                g.drawRect(Math.min(startP.x, endP.x), Math.min(startP.y, endP.y), Math.abs(endP.x - startP.x), Math.abs(endP.y - startP.y));
                break;
            case 'l':
                g.drawLine(startP.x, startP.y, endP.x, endP.y);
                break;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Paint");
        dynamicSekil panel = new dynamicSekil();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        JButton btnRect = new JButton("Dörtgen");
        JButton btnLine = new JButton("Çizgi");
        btnLine.setBounds(0,0,60,60);
        btnRect.setBounds(0,60,60,60);
        btnLine.setMargin(new Insets(0,0,0,0));
        btnRect.setMargin(new Insets(0,0,0,0));
        panel.setBounds(60,0,740,600);
        frame.add(btnRect);
        frame.add(btnLine);
        frame.add(panel);

        btnLine.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                s = 'l';
            }
        });
        btnRect.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                s = 'r';
            }
        });
    }

    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        startP = e.getPoint();
    }

    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        endP = e.getPoint();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {}
}