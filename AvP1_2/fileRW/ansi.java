package fileRW;

import java.io.*;

public class ansi {
   public static void main(String[] args) {
      try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\emres2005\\Documents\\KSBU Java\\fileRW\\ansi.txt"))){
         //String[] res = reader.readLine().split("x");
         //int width = Integer.parseInt(res[0]);
         //int height = Integer.parseInt(res[1]);
         //int[] art = new int[width*height];
         String Line;

         while((Line = reader.readLine()) != null){
            //String[] newLine = new String[Line.length()];
            //System.out.println(Line);
            for (char c : Line.toCharArray()) {
               if(c ==1){System.out.println('█');}else
               if(c==0){System.out.println('▏');}
            }
            //Writer.println();
         }
         /**for(int i=0; i<art.length; i++){
            art[i] = reader.read();
            if(art[i] == 0){
               System.out.println('▏');
            }else if(art[i] == 1){
               System.out.println('█');
            }

            System.out.println(art[i]);
         }**/

      } catch (IOException e) {
         e.printStackTrace();
      }
      
   } 
}