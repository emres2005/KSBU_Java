import java.util.Scanner;

public class sayiMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]sayilar=new int[5];
        for(int i=0;i<5;i++){
        System.out.println(i+".Sayıyı girin.");
        sayilar[i]=input.nextInt();
        }
        int enb=sayilar[0];
        int enk=sayilar[0];
        for (int e : sayilar) {
            if (e>enb){enb=e;};
            if (e<enk){enk=e;};
        }
        System.out.println("En büyük sayı: "+enb);
        System.out.println("En küçük sayı: "+enk);
        System.out.println("Ortalama: " + (sayilar[0]+sayilar[1]+sayilar[2]+sayilar[3]+sayilar[4]+sayilar[5]/6));    
        input.close();
    }
}