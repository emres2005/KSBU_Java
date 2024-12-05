import java.util.Scanner;

public class kenarBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hipotenüs uzunluğunu girin: ");
        double hipot = input.nextDouble();
        System.out.println("Dik olmayan açılardan birini girin: ");
        double aci = input.nextDouble();
        System.out.println("Öbür açı = " + (90-aci) + '°');
        System.out.println("Karşı kenar uzunluğu = " + (hipot*Math.sin(Math.toRadians(aci))));
        System.out.println("Komşu kenar uzunluğu = " + (hipot*Math.cos(Math.toRadians(aci))));
        System.out.println("Üçgenin alanı = " + (Math.pow(hipot,2)*Math.sin(Math.toRadians(aci))*Math.cos(Math.toRadians(aci))/2));
        System.out.println("Çevresi = " + (hipot*( 1 + Math.cos(Math.toRadians(aci)) + Math.sin(Math.toRadians(aci)) )));
        input.close();
    }
}
