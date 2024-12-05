package dynamicArrays;

import java.util.Random;

public class siralarVEogrenciler {
    //40 sıra ve 40 öğrenci var. Öğrencileri sıralara rastgele oturt
    public static void main(String[] args) {
        int[] ogrenciler = new int[39];
        int[] siralar = new int[39];
        for (int i = 0; i < 39; i++) {
            ogrenciler[i] = i+1;
            siralar[i] = i+1;
        }
        Random rand = new Random();
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println((ogrenciler[rand.nextInt(40)]+1)+". Öğrenci "+(siralar[rand.nextInt(40)]+1)+". Sıraya");
        }
    }
}
