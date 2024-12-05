package liskov;

public class executable {
    public static void main(String[] args) {
        sekil sekil1 = new daire(2.0);
        sekil sekil2 = new dortgen(4.0,4.0);
        sekil1.bilgiGoruntule();
        System.out.println("Alan: "+sekil1.alanHesapla());
        sekil2.bilgiGoruntule();
        System.out.println("Alan: "+sekil2.alanHesapla());
    }
}
