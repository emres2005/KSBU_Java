package threadler;

public class isparcacik3 {
    public static void main(String[] args) {
        
        Thread thread = new Thread(() -> {
            System.out.println("Bu bir threaddir.");
        });
        thread.start();
    }
}
