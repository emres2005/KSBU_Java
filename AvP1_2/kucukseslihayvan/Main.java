package kucukseslihayvan;

public class Main {
    public static void main(String[] args){
        SesliHayvan kedi = new Kedi();
        SesliHayvan kus = new Kus();
        SesliHayvan aslan = new Aslan();
        SesliHayvan kopek = new Kopek();
        kedi.sesCikar();
        kus.sesCikar();
        aslan.sesCikar();
        kopek.sesCikar();
    }
}   

