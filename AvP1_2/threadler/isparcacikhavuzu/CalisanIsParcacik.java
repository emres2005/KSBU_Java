package AvP1_2.threadler.isparcacikhavuzu;

public class CalisanIsParcacik implements Runnable{
    
    private String gorevAd;    
    public CalisanIsParcacik(String gorevAd){
            this.gorevAd = gorevAd;
        } 
        
        @Override
        public void run(){
           System.out.println(Thread.currentThread().getName() + " iş parçacığı "+gorevAd+" işini gerçekleştiriyor.");
           try {
               Thread.sleep(1);
           }catch (InterruptedException e){}

           System.out.println(Thread.currentThread().getName() + " iş parçacığı "+gorevAd+" işini tamamladı.");
        }
    }