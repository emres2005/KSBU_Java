import java.time.Instant;
import java.util.Scanner;

public class tahmin {
    public static void main(String[] args) {
        int sayi = (int) (Math.random()*100);
        Scanner input = new Scanner(System.in);
        int tahmin;
        Instant bas = Instant.now();
        long basZaman = bas.getEpochSecond();
        do {
        System.out.println("Tahmininizi giriniz (1-100 aralığında): \n");
        tahmin = input.nextInt();
        if(tahmin<sayi){
            System.out.println("Çık");
        }else if(tahmin>sayi){
            System.out.println("İn");
        }else{
            System.out.println("Sayıyı buldunuz");
        }
        }while(tahmin!=sayi);
        Instant son = Instant.now();
        long sonZaman = son.getEpochSecond();
        System.out.println("Sayıyı bulma süresi: " + (sonZaman-basZaman) + 's');
        input.close();
    }
}
