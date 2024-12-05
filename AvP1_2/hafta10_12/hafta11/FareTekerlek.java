package hafta10_12.hafta11;

import javax.swing.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class FareTekerlek extends JFrame implements MouseWheelListener {
    public FareTekerlek(){
        addMouseWheelListener(this);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FareTekerlek();
    }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            int tekerlekKonum = e.getWheelRotation();
            if (tekerlekKonum< 0) {
                System.out.println("Fare yukarı hareket etti." + tekerlekKonum);
            } else {
                System.out.println("Fare aşağı hareket etti." + tekerlekKonum);

            }

        }
}
