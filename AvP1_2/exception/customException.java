package exception;

import javax.swing.JOptionPane;

class AritmetikGereksizlikException extends Exception{
    public AritmetikGereksizlikException(String message){
        super(message);
    }
}

class EmptyTextFieldException extends Exception{
    public EmptyTextFieldException(String message){
        super(message);
    }
}

class textField{
    public String write(String text) throws EmptyTextFieldException{
        if (text == ""){
            throw new EmptyTextFieldException("Metin alanı boş bırakılamaz!");
        }
        return text;
    }
}

class hesapMakinesi{
    public int topla(int sayi1, int sayi2) throws AritmetikGereksizlikException{
        if(sayi1==0 || sayi2==0){
            throw new AritmetikGereksizlikException("Sayılardan biri veya ikisi sıfır. İşlem gereksiz!");
        }
        return sayi1+sayi2;
    }

    public int carp(int sayi1, int sayi2) throws AritmetikGereksizlikException{
        if(sayi1==1 || sayi2==1){
            throw new AritmetikGereksizlikException("Sayılardan biri veya ikisi bire eşit. İşlem gereksiz!");
        }
        return sayi1*sayi2;
    }
}

public class customException {
    public static void main(String[] args) {
        hesapMakinesi islem = new hesapMakinesi();
        try {
            int sonuc = islem.topla(10, 0);
            System.out.println("Sonuç: "+sonuc);
        } catch (AritmetikGereksizlikException e) {
            System.out.println("Hata: "+e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik Hatası: "+e.getMessage());
        }

        try {
            int sonuc2 = islem.carp(10,1);
            System.out.println("Sonuç: "+sonuc2);
        } catch (AritmetikGereksizlikException e) {
            System.out.println("Hata: "+e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Aritmetik Hatası: "+e.getMessage());
        }

        textField tf1 = new textField();
        try {
            String text= tf1.write("");
            System.out.println("Yazılan metin: "+text);
        } catch (EmptyTextFieldException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Hata!", 0);
            //System.out.println("Hata: "+e.getMessage());
        }
    }
}