package threadler;

class mythread extends Thread{
        public void run(){
                System.out.println("Bu bir threaddir.");
        }
}
public class isparcacik1 {
    public static void main(String[] args) {
        mythread thread = new mythread();
        thread.start();
    }
}
