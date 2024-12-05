package hafta10_12.hafta11;

import javax.swing.*;
import java.awt.event.*;

public class KlavyeAdaptor extends JFrame {
    public KlavyeAdaptor() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Klavyeden tusa basıldı: " + e.getKeyChar());
            }
            });
            setSize(300, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
        public static void main(String[] args) {
            new KlavyeAdaptor();
        }
}