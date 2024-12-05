public class KarmasikSayi {
    private double re,im;

    public KarmasikSayi(double re,double im){
        this.re = re;
        this.im = im;
    }
    KarmasikSayi(KarmasikSayi c){
        System.out.println("Kopyalama yapıcısı çalıştırıldı!");
        re = c.re;
        im = c.im;
    }
    public static void main(String[] args) {
        
    }
}


