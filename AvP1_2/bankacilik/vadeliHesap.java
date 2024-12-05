package bankacilik;

public class vadeliHesap extends hesap {
    private int vade;
    public vadeliHesap(double bakiye,int vade){
        super(bakiye);
        this.vade = vade;
    }

    @Override
    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println(miktar+" TL yatırıldı.");
    }

    @Override
    public void paraCek(double miktar){
        if(vade>0){
            System.out.println("Vade süresi dolmadığı için para çekilemiyor!");
        }else{
            if(miktar>bakiye){
                System.out.println("Yetersiz bakiye!");
            }else{
                bakiye -= miktar;
                System.out.println(miktar + " TL çekildi.");
            }
        }
    }

    @Override
    public void bakiyeSorgula(){
        System.out.println("Bakiye: "+bakiye+"TL");
    }
}
