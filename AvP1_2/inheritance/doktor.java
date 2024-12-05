package inheritance;

public class doktor extends kullanici{
    public String bolum;
    public doktor(String ad,String soyad,String bolum){
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
        this.tip = "Doktor";
    }
    public void muayeneYap(hasta hasta){
        System.out.println(this.ad+' '+this.soyad+" isimli doktor "+hasta.ad+' '+hasta.soyad+"'ı muayene etti.");
    }
    public void ilacYaz(hasta hasta){
        System.out.println(this.ad+' '+this.soyad+" isimli doktor "+hasta.ad+' '+hasta.soyad+"'a muayeneilaç yazdı.");
    }
    public void tedaviYap(hasta hasta){
        System.out.println(this.ad+' '+this.soyad+" isimli doktor "+hasta.ad+' '+hasta.soyad+"'a tedavi yaptı.");
    }
}
