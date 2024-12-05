package liskov;

public class daire extends sekil{
    private Double cap;
    public daire(Double r){
        this.cap = r;
    }
    @Override
    public Double alanHesapla(){
        return Math.PI * cap * cap;
    }
    @Override
    public void bilgiGoruntule(){
        System.out.println("Daire \nYarıçap: "+cap);
    }
}
