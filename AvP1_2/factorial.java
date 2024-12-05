import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);
        System.out.println("Faktöriyelini hesaplamak istediğiniz sayıyı girin: ");
        int sayi = girdi.nextInt();
        long sonuc = 1;
        for(int i = 1;i<=sayi;i++){
            sonuc *= i;
        }
        System.out.println("Faktöriyelin sonucu: " + sonuc);
        girdi.close();
    }
}
