package fileRW;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class okumaHizi {
    public static void main(String[] args)throws IOException {
        try{
            File file = new File("C:\\\\Users\\\\emres2005\\\\Desktop\\\\Metin.txt");
            Scanner reader = new Scanner(file,Charset.forName("UTF-8"));
            
            int boslukSayisi = 0;
            while(reader.hasNextLine()){
                String satir = reader.nextLine();
                boslukSayisi += satir.split("").length-1;
            }
            reader.close();
            System.out.println("Dosyadaki toplam kelime sayısı: "+(boslukSayisi+1));
            System.out.println("Okuma süresi " + (((boslukSayisi+1)*60)/200)+" saniye");
        }catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: "+e.getMessage());
        }
    }
}
