package ActionListener;

import javax.swing.*;

public class uyg1_menuOrnegi {
    public static void main(String[] args) {
        double ver = 1;

        JFrame frame = new JFrame("Menü Örneği");
        JMenuBar menuBar = new JMenuBar();
        JMenu helpMenu = new JMenu("Yardım");
        JMenuItem menuItem = new JMenuItem("Hakkında");
        helpMenu.add(menuItem);
        menuItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Menü Örneği " + ver + "\nEmre K.", "Hakkında", JOptionPane.INFORMATION_MESSAGE);
        });
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 240);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
