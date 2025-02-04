package AvP1_2.threadler.isparcacikhavuzu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IsparcacikHavuzu {
    public static void main(String[] args){
            ExecutorService executor = Executors.newFixedThreadPool(15);
            
            for(int i=0; i<256000; i++) {
                Runnable isci = new CalisanIsParcacik("Görev "+(i+1));
                executor.execute(isci);
            }
            executor.shutdown();
            while(!executor.isTerminated()){}
            System.out.println("Tüm işler tamamlandı.");
        }
}
