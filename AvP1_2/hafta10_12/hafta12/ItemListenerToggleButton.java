package hafta10_12.hafta12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerToggleButton implements ItemListener {
    JToggleButton toggleButton;
    JLabel label;

    public ItemListenerToggleButton() {
        JFrame frame = new JFrame("ToggleButton Örneği");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);

        toggleButton = new JToggleButton("Toggle Button");
        label = new JLabel("Durum: Pasif");

        toggleButton.addItemListener(this);

        frame.add(toggleButton);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e){
        if (toggleButton.isSelected()) {
            label.setText("Durum: Aktif");
        }else {
            label.setText("Durum: Pasif");
        }
    }

    public static void main(String[] args) {
        new ItemListenerToggleButton();
    }
}