package hafta10_12.hafta10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Basit çizim");
        PanelleCizim cizim0 = new PanelleCizim();
        TuvalleCizim cizim1 = new TuvalleCizim();
        //frame.add(cizim0);
        frame.add(cizim1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
