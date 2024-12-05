package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class uyg2_textField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Metin Ekle");
        button.addActionListener(e -> {
            String[] names = {"Burak", "Ayse", "Ebru", "Merve", "Serra", "Ahmet", "Mert","Zeynep","Neslisah", "Nil"};
            Random rand = new Random();
            int index = rand.nextInt(names.length);
            textField.setText("Merhaba "+names[index]);
        });
        frame.add(textField);
        frame.add(button);
        frame.setSize(320, 240);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
    }
}
