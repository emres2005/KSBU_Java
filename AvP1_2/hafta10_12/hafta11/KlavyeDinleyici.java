package hafta10_12.hafta11;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KlavyeDinleyici extends JFrame implements KeyListener {
    public KlavyeDinleyici() {
        addKeyListener(this);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new KlavyeDinleyici();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Klavyeden yazıldı: "+ e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Tuşa basıldı: " + e.getKeyCode());
        if(e.getKeyCode() == KeyEvent.VK_UP){
            System.out.println("Yukarı tuşuna basıldı");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Tuş bırakıldı: " + e.getKeyChar());
    }
}