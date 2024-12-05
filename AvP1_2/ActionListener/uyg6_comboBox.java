package ActionListener;

import javax.swing.*;
import java.awt.*;

public class uyg6_comboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String[] takimlar = {"GalataSaray", "FenerBahçe", "BeşikTaş", "BursaSpor"};
        JComboBox<String> comboBox = new JComboBox<>(takimlar);
        JLabel label = new JLabel();
        comboBox.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource();
            String select = (String) cb.getSelectedItem();
            label.setText("Şampiyon: " + select);
        });
        frame.add(comboBox);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 240);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());
    }
}
