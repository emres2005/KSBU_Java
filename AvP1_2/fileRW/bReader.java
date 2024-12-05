package fileRW;

import java.io.*;
import java.nio.charset.Charset;

public class bReader {
    public static void main(String[] args) {
        try {
            File dosya = new File("C:\\Users\\emres2005\\Desktop\\Dosya.txt");
            BufferedReader reader = new BufferedReader(new FileReader(dosya,Charset.forName("UTF-8")));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
