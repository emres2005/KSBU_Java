package hafta10_12.hafta10;

import java.awt.*;

public class TuvalleCizim extends Canvas {
    public void paint(Graphics g) {
        g.drawString("Hello",40,40);
        setBackground(Color.white);
        g.fillRect(130,30,100,80);
        g.drawOval(30,130,50,60);
        setForeground(Color.red);
        g.fillOval(130,130,50,60);
        g.drawArc(30,200,40,50,90,60);
        g.fillArc(30, 130, 40,50,180,40);
        g.drawLine(40,40,190,190);
    }
}
