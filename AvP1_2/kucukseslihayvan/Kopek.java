package kucukseslihayvan;

public class Kopek  implements SesliHayvan {
    @Override
    public void sesCikar(){
        System.out.println("Hav hav!");
    }
    public void kos(){
        System.out.println("Köpek koşuyor.");
    }
}
