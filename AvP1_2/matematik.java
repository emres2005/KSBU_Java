import java.util.Scanner;

public class matematik {
    public static void main(String[] args){
        Scanner girinti = new Scanner(System.in);
        System.out.println("Sayı girin: ");
        double num0 = girinti.nextDouble();
        System.out.println("Başka bır sayı girin: ");
        double num1 = girinti.nextDouble();
        System.out.println("İlk sayının: \n Mutlak değeri: "+Math.abs(num0));
        System.out.println("Karekökü: "+Math.sqrt(num0));
        System.out.println("Küpkökü: "+Math.cbrt(num0));
        System.out.println("5.kuvveti: "+Math.pow(num0,5));
        System.out.println("2. sayının: \n Mutlak değeri: "+Math.abs(num1));
        System.out.println("Karekökü: "+Math.sqrt(num1));
        System.out.println("Küpkökü: "+Math.cbrt(num1));
        System.out.println("5.kuvveti: "+Math.pow(num1,5));
        System.out.println("2 sayı arasından en büyüğü: "+Math.max(num1,num0));
        System.out.println("2 sayı arasından en küçüğü: "+Math.min(num1,num0));
        num0 = 1.45;
        System.out.println("İlk sayı artık "+num0);
        System.out.println("Sayıyı yuvarlıyorum, sonuç: "+Math.round(num0));
        System.out.println("Aşağı yuvarla: "+Math.floor(num0));
        System.out.println("Yukarı yuvarla: "+Math.ceil(num0));
        girinti.close();
    }
}   