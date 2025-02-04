package AvP1_2.interfaces;

public class Aslan implements SesliHayvan, KosanHayvan {
    @Override
    public void sesCikar() {
        System.out.println("Rovvrrr");
    }
    @Override
    public void kos() {
        System.out.println("Aslan koşuyor");
    }
}
