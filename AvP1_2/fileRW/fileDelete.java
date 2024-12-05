package fileRW;

import java.io.*;

public class fileDelete {
    public static void main(String[] args) {
        File dosya = new File( "silinecekDosya.txt");
        if(dosya.delete()){
            System.out.println("Dosya silindi:"+ dosya.getName());
        }else{
            System.out.println("Dosya silinemedi.");
        }
    }
}
