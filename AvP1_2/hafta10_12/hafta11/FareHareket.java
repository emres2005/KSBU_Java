package hafta10_12.hafta11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FareHareket extends JFrame implements MouseListener {
    Label label;
    FareHareket(){
        addMouseListener(this);
        label = new Label();
        label.setBounds(50,50, 200, 50);
        label.setBackground(Color.red);
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
    }
    public static void main(String[] args) {
        new FareHareket();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Fare Tıklandı!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Fare basıldı.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Fare bırakıldı");
        System.out.println("Fare bırakıldı");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Fare pencere üzerine geldi"+e.getX()+' '+e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Fare pencere üzerinden çıktı");
    }
}
