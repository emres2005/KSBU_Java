package gui;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CokluSecenek {
    public static void main (String[] args){
        String[] pastalar = {"Çikolatalı","Çilekli","Frambuazlı","Orman Meyveli","Muzlu"};
        String[] icecekler = {"Kola","Gazoz","Fanta","Meyve Suyu","Maden Suyu"};

        ImageIcon pastaicon = new ImageIcon("C:\\Users\\emres2005\\Documents\\KSBU Java\\gui\\pasta.png");
        ImageIcon icecekicon = new ImageIcon("C:\\Users\\emres2005\\Documents\\KSBU Java\\gui\\icecek.png");

        int pasta =JOptionPane.showOptionDialog(
            null,
            "Pasta seçiniz: ", 
            "Pasta",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            pastaicon,
            pastalar,
            pastalar[0]
            );
        String sPasta = pastalar[pasta];

        String sIcecek = (String) JOptionPane.showInputDialog(
            null,
            "İçecek seçiniz: ",
            "İçecek",
            JOptionPane.QUESTION_MESSAGE,
            icecekicon,
            icecekler,
            icecekler[0]
            );
        JOptionPane.showMessageDialog(
            null,
            "Seçilen pasta: "+sPasta+"\nSeçilen İçecek: "+sIcecek,
            "Seçilmişler",
            JOptionPane.PLAIN_MESSAGE
        );
    }
}
