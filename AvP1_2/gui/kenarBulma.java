package gui;
import javax.swing.JOptionPane;

public class kenarBulma {
    public static void main(String[] args){
        String input0 = JOptionPane.showInputDialog("Hipotenüs uzunluğu: ");
        double hipot = Double.parseDouble(input0);
        String input1 = JOptionPane.showInputDialog("Dik olmayan açılardan biri: ");
        double aci = Double.parseDouble(input1);
        JOptionPane.showMessageDialog(null, 
        "Öbür açı = " + (90-aci) + "° \n" +
        "Karşı kenar uzunluğu = " + (hipot*Math.sin(Math.toRadians(aci))) + "\n" +
        "Komşu kenar uzunluğu = " + (hipot*Math.cos(Math.toRadians(aci))) + "\n" +
        "Üçgenin alanı = " + (Math.pow(hipot,2)*Math.sin(Math.toRadians(aci))*Math.cos(Math.toRadians(aci))/2) + "\n" +
        "Çevresi = " + (hipot*( 1 + Math.cos(Math.toRadians(aci)) + Math.sin(Math.toRadians(aci)) )) + "\n");
    }
}
