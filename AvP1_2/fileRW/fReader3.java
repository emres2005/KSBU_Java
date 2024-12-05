package fileRW;

import java.io.*;
import java.nio.charset.Charset;

public class fReader3 {
    public static void main(String[] args) {
        try {
            File dosya = new File("C:\\Users\\emres2005\\Desktop\\Dosya.txt");
            FileReader reader = new FileReader(dosya,Charset.forName("UTF-8"));
            System.out.println("Dizi ile okuma: ");
            char[] charArray = new char[10];
            reader.read(charArray);
            System.out.print(charArray);
            reader.close();
            System.out.println("\nDosya okuyucu kapatıldı.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
