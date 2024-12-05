package inheritanceODEV;

public class mainMethod {
    public static void main(String[] args) {
        ucak ucak = new ucak("Uçak","hava","CFM International CFM56","THY","Boeing","737-800");
        araba araba = new araba("Araba","kara","Permanent Magnet Synchronous Motor","16 J 9999","TOGG","T10X");
        gemi gemi = new gemi("Gemi","deniz","yelkenli","tahta","SS Erdem II","Kalyon");
        bisiklet bisiklet = new bisiklet("Bisiklet", "kara", "pedal", "35cm","Bianchi","Nitro 24");
        
        araba.info("Araba");
        araba.bin("Araba");
        araba.getMarka();
        araba.getModel();
        araba.gaz("TOGG","T10X");
        araba.fren("TOGG","T10X");
        araba.in("Araba");

        gemi.info("Gemi");
        gemi.bin("Gemi");
        gemi.getGemiTipi();
        gemi.getAd();
        gemi.ileri();
        gemi.top();
        gemi.in("Gemi");

        ucak.info("Uçak");
        ucak.bin("Uçak");
        ucak.getMarka();
        ucak.getModel();
        ucak.kalkis("THY");
        ucak.inis();
        ucak.in("Uçak");

        bisiklet.info("Bisiklet");
        bisiklet.bin("Bisiklet");
        bisiklet.getMarka();
        bisiklet.getModel();
        bisiklet.vitesDusur("Bianchi","Nitro 24");
        bisiklet.zil();
        bisiklet.in("Bisiklet");
    }
}
