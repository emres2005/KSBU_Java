package inheritance;

public class hasta extends kullanici{
    public String kanGrubu;
    public hasta(String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;
        this.tip = "Hasta";
    }
    public void randevuAl(doktor doktor){
        System.out.println(doktor.bolum+" bölümünden "+doktor.ad+' '+doktor.soyad+" isimli doktora randevu alındı.");
    }
}
