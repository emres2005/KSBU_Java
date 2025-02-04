package AvP1_2.interfaces;

public class Kopek implements SesliHayvan,KosanHayvan{
    @Override
    public void sesCikar(){
        System.out.println("Hav hav!");
    }
    @Override
    public void kos(){
        System.out.println("Köpek koşuyor");
    }
}
