package breakoutReturned;

import javax.swing.*;

public class Main {
    public static String lvlName = null;
    public static void main(String[] args) {
        JFrame frame = new JFrame("SDX-Ball: "+lvlName);
        Game game = new Game();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(game);

    }
}
