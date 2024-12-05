package inheritance;

public class hastane {
    public static void main (String[] args){
        doktor doktor = new doktor("Ahmet","Yılmaz","Genel Cerrahi");
        hemsire hemsire = new hemsire("Ayşe","Arslan");
        hasta hasta = new hasta("Mehmet","Başaran");
        hasta.logIn();
        hasta.randevuAl(doktor);
        doktor.logIn();
        doktor.muayeneYap(hasta);
        hemsire.logIn();
        hemsire.asiYap(hasta);
        hemsire.kanGrubuBelirle(hasta);
        hemsire.tahlilYap(hasta);
        hasta.logOut();
        doktor.logOut();
        hemsire.logOut();
    }
}
