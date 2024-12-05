package interfaces;

public class Kus implements SesliHayvan, UcanHayvan{
    @Override
    public void sesCikar(){
        System.out.println("Cik cik");
    }
    @Override
    public void uc(){
        System.out.println( "Kuş uçuyor");
    }
}
