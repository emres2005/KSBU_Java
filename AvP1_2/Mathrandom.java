import java.util.Scanner;

public class Mathrandom {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args){
        while(true){
            System.out.println(Math.random()*10000);
            Scanner wait = new Scanner(System.in);
            int bekle = wait.nextInt();
        }
    }
}
