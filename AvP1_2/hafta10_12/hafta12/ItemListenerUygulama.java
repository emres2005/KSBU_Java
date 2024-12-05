package hafta10_12.hafta12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerUygulama implements ItemListener {
    JCheckBox onayKutu0, onayKutu1;
    JLabel label;

    public ItemListenerUygulama() {
        JFrame frame = new JFrame("ItemListener Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        onayKutu0 = new JCheckBox("Seçenek 1");
        onayKutu1 = new JCheckBox("Seçenek 2");
        label = new JLabel("Bir seçenek seçin");
        onayKutu0.addItemListener(this);
        onayKutu1.addItemListener(this);
        frame.add(onayKutu0);
        frame.add(onayKutu1);
        frame.setVisible(true);
        frame.add(label);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == onayKutu0) {
            label.setText("Seçenek 1 " + (e.getStateChange() == ItemEvent.SELECTED ? "seçildi" : "seçimi kaldırıldı"));
        } else if (e.getSource() == onayKutu1) {
            label.setText("Seçenek 2 " + (e.getStateChange() == ItemEvent.SELECTED ? "seçildi" : "seçimi kaldırıldı"));
        }
    }

    public static void main(String[] args) {
        new ItemListenerUygulama();
    }
}
