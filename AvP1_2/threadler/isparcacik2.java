package threadler;

class myrunnable implements Runnable{
    public void run(){
        System.out.println("Bu bir threaddir.");
    }
}

public class isparcacik2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new myrunnable());
        thread.start();
    }
}
