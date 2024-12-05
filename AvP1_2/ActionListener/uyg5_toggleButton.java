package ActionListener;

import javax.swing.*;
import java.awt.*;

public class uyg5_toggleButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toggle Button Örnek");
        JToggleButton toggleButton = new JToggleButton("Tıklayınız");
        JLabel label = new JLabel();
        toggleButton.addActionListener(e -> {
            if (toggleButton.isSelected()) {
                label.setText("Toggle button aktif!");
            }else {
                label.setText("Toggle button pasif!");
            }
        });
        frame.add(toggleButton);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(320,240);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
