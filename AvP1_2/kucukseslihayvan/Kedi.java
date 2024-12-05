package kucukseslihayvan;

public class Kedi implements SesliHayvan {
    @Override
    public void sesCikar(){
        System.out.println("Miyav!");
    }
    public void kediKac(){
        System.out.println("Kedi kaçıyor.");
    } 
}
