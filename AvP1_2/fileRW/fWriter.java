package fileRW;

import java.io.*;

public class fWriter {
    public static void main(String[] args) {
        try {
            File dosya  = new File("C:\\Users\\emres2005\\Desktop\\Dosya_yaz.txt");
            if(dosya.createNewFile()){
                System.out.println("Dosya oluşturuldu: "+dosya.getName());
            }
            FileWriter writer = new FileWriter(dosya);
            writer.write("Bu dosyaya yazılan metin.");
            writer.close();
        } catch (Exception e) {
            System.out.println("Bir hata oluştu");
            e.printStackTrace();
        }
    }
}
