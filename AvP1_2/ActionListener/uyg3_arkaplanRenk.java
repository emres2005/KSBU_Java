package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class uyg3_arkaplanRenk {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Arkaplan Renk Örneği");
        JButton button = new JButton("Arkaplan rengini değiştir!");

        button.addActionListener(e -> {
            Random rand = new Random();
            frame.getContentPane().setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
        });
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320,240);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
    }
}
