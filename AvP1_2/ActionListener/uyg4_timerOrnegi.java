package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class uyg4_timerOrnegi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Timer Örnek");
        JLabel label = new JLabel("Zaman: 0",SwingConstants.CENTER);
        frame.add(label);
        Timer timer = new Timer(1000, new ActionListener(){
            int counter = 0;
            public void actionPerformed(ActionEvent e) {
                counter++;
                Color[] colors = {Color.YELLOW, Color.RED};
                frame.getContentPane().setBackground(colors[counter % 2]);
                label.setText((counter % 2 == 0) ? "ŞAMPİYON GALATASARAY" : "Zaman: "+counter);
            }
        });
        timer.start();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 240);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
