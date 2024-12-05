package bankacilik;

public class yatirimHesap extends hesap {
    public yatirimHesap(double bakiye){
        super(bakiye);
    }
    int hisseAdet = 0;
    @Override
    public void paraYatir(double miktar){
        bakiye += miktar;
    }

    @Override
    public void paraCek(double miktar){
        if(miktar>bakiye){
            System.out.println("Yetersiz bakiye!");
        }else{
            bakiye -=miktar;
            System.out.println("Bakiye: "+bakiye+"TL");
        }
    }

    @Override
    public void bakiyeSorgula(){
        System.out.println("Bakiye: "+bakiye+"TL");
    }

    public void hisseAl(String sembol,int adet,int fiyat){
        bakiye -= (adet*fiyat);
        hisseAdet += adet;
        System.out.println(fiyat+"TL fiyatından "+adet+" adet "+sembol+" alındı.");
    }
    public void hisseSat(String sembol,int adet,int fiyat){
        if(hisseAdet<adet){
            System.out.println("Hesabınızda "+adet+" adet hisse yok!\nHesaptaki hisse adeti: "+hisseAdet);
        }
        
        bakiye += (adet*fiyat);
        hisseAdet -= adet;
        System.out.println(fiyat+"TL fiyatından "+adet+" adet "+sembol+" satıldı.");
    }
}
