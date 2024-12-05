import java.util.Scanner;

public class yazTopla {
    public static void main(String[] args){
        Scanner keyInput = new Scanner(System.in);
        int i=0;
        System.out.println("Çıkmak için 0 yazın.");
        while(true){ 
            System.out.println("Sayı girin: ");
            int sayi = keyInput.nextInt();
            if(sayi==0){break;}
            i += sayi;
            System.out.println("Toplam: " + i);
        }
        keyInput.close();
    }
}
