package dynamicArrays;

import javax.swing.*;
import java.awt.*;

public class pencere {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Pencere Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JLabel label = new JLabel();
        label.setBounds(400, 240, 1600, 40);
        label.setText("5:0");
        frame.add(label);
        label.setFont(new Font("Tahoma", Font.PLAIN, 140));
    }
}
