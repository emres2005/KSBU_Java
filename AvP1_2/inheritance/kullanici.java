package inheritance;

public class kullanici {
    public String ad, soyad, tip;
    public void logIn(){
        System.out.println(this.tip+' '+this.ad+' '+this.soyad+" giriş yaptı!");
    }
    public void logOut(){
        System.out.println(this.tip+' '+this.ad+' '+this.soyad+" çıkış yaptı!");
    }
}