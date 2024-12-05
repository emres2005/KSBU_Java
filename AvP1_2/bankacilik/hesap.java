package bankacilik;

public abstract class hesap {
    protected double bakiye;
    public hesap(double bakiye){
        this.bakiye=bakiye;
    }
    public abstract void paraYatir(double miktar);
    public abstract void paraCek(double miktar);
    public abstract void bakiyeSorgula();
}
