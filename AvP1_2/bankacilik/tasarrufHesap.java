package bankacilik;

public class tasarrufHesap extends hesap {
    public tasarrufHesap(double bakiye){
        super(bakiye);
    }

    @Override
    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println(miktar+" TL yatırıldı.");
    }

    @Override
    public void paraCek(double miktar){
        if(miktar>bakiye){
            System.out.println("Yetersiz bakiye!");
        }else{
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi.");
        }
    }

    @Override
    public void bakiyeSorgula(){
        System.out.println("Bakiye: "+bakiye+"TL");
    }
}
