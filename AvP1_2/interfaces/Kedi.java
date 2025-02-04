package AvP1_2.interfaces;

public class Kedi implements SesliHayvan, KosanHayvan{
    @Override
    public void sesCikar(){
        System.out.println("Miyav!");
    }
    @Override
    public void kos(){
        System.out.println("Kedi koşuyor");
    }
}
