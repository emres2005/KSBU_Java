import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girilecek sayı sayısını girin");
        int numOFnums = input.nextInt();
        int[] sayilar = new int[numOFnums];
        for(int k=0 ; k < sayilar.length ; k++){
            System.out.println(k+1 + ".Sayıyı girin");
            sayilar[k]=input.nextInt();
        }
        for (int i = 0; i < numOFnums-1; i++) {
            for (int j = 1; j < numOFnums-i; j++) {
                if(sayilar[j]>sayilar[j-1]){
                    int temp=sayilar[j-1];
                    sayilar[j-1]=sayilar[j];
                    sayilar[j]=temp;
                }
            }
        }
        System.out.println("Büyükten küçüğe sıralama");
        for (int k = 0; k < sayilar.length; k++) {
            System.out.println(sayilar[k]);
        }
        input.close();
    }
}
