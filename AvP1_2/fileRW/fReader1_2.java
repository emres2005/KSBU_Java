package fileRW;

import java.io.*;
import java.nio.charset.Charset;

public class fReader1_2 {
    public static void main(String[] args) {
        try {
            File dosya = new File("C:\\Users\\emres2005\\Desktop\\Dosya.txt");
            //FileReader reader = new FileReader(dosya);
            FileReader reader = new FileReader(dosya,Charset.forName("UTF-8"));
            System.out.println("Karakter okuma: ");
            int i;
            while((i = reader.read()) != -1){
                System.out.print((char) i);
            }
            reader.close();
            System.out.println("\nDosya okuyucu kapatıldı.");
        } catch (IOException e) {
                System.out.println(e);
        }
    }
}
