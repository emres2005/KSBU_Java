package gui;
import javax.swing.*;

public class buttonDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Buton & Metin Kutusu Demo");
        JTextField tf = new JTextField();
        tf.setBounds(20,20,200,20);
        JTextArea ta = new JTextArea();
        ta.setBounds(20,60,400,300);
        JButton b = new JButton("Gönder!");
        b.setBounds(20,400,80,45);
        f.add(b);
        f.add(ta);
        f.add(tf);
        f.setSize(460,600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
