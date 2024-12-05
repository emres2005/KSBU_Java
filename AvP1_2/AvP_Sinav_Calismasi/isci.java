package AvP_Sinav_Calismasi;

public class isci {
    String ad,soyad,sehir,gorev;
    int maas;
    public isci(String ad,String soyad,int maas,String sehir,String gorev){
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.sehir = sehir;
        this.gorev = gorev;
    }
    public static void main(String[] args) {
        isci isci0 = new isci("Karl", "Marx", 3200, "Moskova", "Filozof");
        System.out.println("Ad: " + isci0.ad);
        System.out.println("Soyad: " + isci0.soyad);
        System.out.println("Maaş: " + isci0.maas);
        System.out.println("Şehir: " + isci0.sehir);
        System.out.println("Görev: " + isci0.gorev);
    }
}
