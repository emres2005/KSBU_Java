package hafta10_12.hafta10;

import javax.swing.*;
import java.awt.*;

public class PanelleCizim extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillRect(50,50,100,100);
        g.setColor(Color.red);
        g.fillOval(200,50,100,100);
        g.setColor(Color.black);
        g.drawString("Merhaba, Java!",150,200);
    }
}
