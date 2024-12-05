package fileRW;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) throws IOException {
        try {
            File dosya = new File("C:\\Users\\emres2005\\Desktop\\Dosya.txt");
            Scanner reader = new Scanner(dosya,Charset.forName("UTF-8"));
            while(reader.hasNextLine()){
                String veri = reader.nextLine();
                System.out.println(veri);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Bir hata oluştu.");
            e.printStackTrace();
        }
    }
}
