import java.util.Scanner;

public class cember {
    public static void main(String[] args){
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Çemberin yarıçapını girin: \n");
        long r = keyInput.nextLong();
        System.out.println("Girilen çemberin çevresi: " + (2*Math.PI*r));
        System.out.println("\n Alanı: " + (Math.PI*Math.pow(r,2)));
        keyInput.close();
    }
}
