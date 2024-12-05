package hafta10_12.hafta11;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FareDurum extends JFrame implements MouseMotionListener {
    public FareDurum() {
        addMouseMotionListener(this);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new FareDurum();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Fare ("+e.getX()+","+e.getY()+") konumuna sürüklendi.");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Fare ("+e.getX()+","+e.getY()+") konumuna taşındı.");
    }
}
