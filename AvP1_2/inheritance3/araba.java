package inheritance3;

public class araba extends arac {
    public araba(String plakaNo){
        super(plakaNo);
    }
    public void motorCalistir(String araba){
        super.motorCalistir(araba);
    }
    public void catiyiAc(){
        System.out.println(super.plakaNo+" plakalı "+super.model+"'nın sunroofu açıldı.");
    }
}
