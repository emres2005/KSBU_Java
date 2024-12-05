package gui;
import javax.swing.JOptionPane;

public class y_n {
    public static void main(String[] args) {
        int cikti = JOptionPane.showConfirmDialog(
            null,
            "Emin misin?",
            "SEÇ",
            JOptionPane.YES_NO_CANCEL_OPTION
        );
        JOptionPane.showMessageDialog(null, "Çıktı: "+cikti);
    }
}
