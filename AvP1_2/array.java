import java.util.Scanner;

public class array {
    public static void main(String[] args){
        String[] ad = {"Yahya ","Kubilay ","Mehmet Nuri ","Engin ","Cemal ","Murat "};
        String[] soyad = {"Karakuş ","Taştutar ","Yazıcı ","Demiroğ ","Başaran ","Yıldırım "};
        int[] yas = {42,26,40,35,45,38};
        Scanner keyInput = new Scanner(System.in);
        System.out.println(" Görüntülenecek isim numarası (0-6): ");
        int a = keyInput.nextInt();
        System.out.println(" Görüntülenecek soyisim numarası (0-6): ");
        int b = keyInput.nextInt();
        System.out.println(" Görüntülenecek yaş numarası (0-6): ");
        int c = keyInput.nextInt();
        System.out.println(ad[a-1] + soyad[b-1] + yas[c-1]);
        keyInput.close();
    }
}
