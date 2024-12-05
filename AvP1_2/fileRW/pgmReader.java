package fileRW;

import java.io.*;

public class pgmReader {
        @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException{
        String filePath = "C:\\Users\\emres2005\\Desktop\\PGM\\coins.ascii.pgm";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String sihirliSayi = reader.readLine();
            String yorum = reader.readLine();
            String[] boyut = reader.readLine().split(" ");
            
            String maxDegerStr = reader.readLine();
            System.out.println(boyut[0] +' '+ boyut[2] +' '+maxDegerStr);
            
            int genislik = Integer.parseInt(boyut[0]);
            int yukseklik = Integer.parseInt(boyut[2]);
            int maxDeger = Integer.parseInt(maxDegerStr);
            
            int[] goruntuVerileri = new int[genislik * yukseklik];
            String Line;
            
            while ((Line = reader.readLine()) != null) {
                String[] yenisatir = new String[Line.length()];
                
                System.out.println(Line);
            }
            for(int i = 0; i<goruntuVerileri.length; i++){
                goruntuVerileri[i] = reader.read();
                System.out.println(goruntuVerileri[i]);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
