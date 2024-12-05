package inheritance;

public class hemsire extends kullanici{
    public hemsire(String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;
        this.tip = "Hemşire";
    }
    
    public void asiYap(hasta hasta){
        System.out.println(hasta.ad+' '+hasta.soyad+" isimli hastaya aşı yapıldı.");
    }
    public void tahlilYap(hasta hasta){
        System.out.println(hasta.ad+' '+hasta.soyad+" isimli hastaya kan tahlili yapıldı.");
    }
    public void kanGrubuBelirle(hasta hasta){
        hasta.kanGrubu = "0 Rh+";
        System.out.println(hasta.ad+' '+hasta.soyad+"adlı hastanın kan grubu"+hasta.kanGrubu+'.');
    }
}
