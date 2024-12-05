package gui;

import javax.swing.*;

public class DenklemCozumu {
    public static void main(String[] args) {
        JFrame f = new JFrame("2.Dereceden Denklem Çözüm Sihirbazı");
        JTextField xtf = new JTextField();
        JLabel xl = new JLabel("x +");
        JTextField ytf = new JTextField();
        JLabel yl = new JLabel("y =");
        f.add(xl);
        f.add(xtf);
        f.add(yl);
        f.add(ytf);
        xl.setBounds(100,100,10,10);
        yl.setBounds(100,200,10,10);
        xtf.setBounds(20,3000,200,20);
        ytf.setBounds(20,400,200,20);
        f.setSize(800,600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
