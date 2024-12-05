import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        while (true)
        {
            @SuppressWarnings("resource")
            Scanner keyInput = new Scanner(System.in);
            System.out.println("1.Sayı: ");
            Double x = keyInput.nextDouble();
            System.out.println("İşaret: ");
            String islem = keyInput.next();
            System.out.println("2.Sayı: ");
            Double y = keyInput.nextDouble();

            System.out.println("Sonuç: ");

            switch (islem)
            {
            case "+":
                System.out.println((x+y)+"\n");
                break;
            case "-":
                System.out.println((x-y)+"\n");
                break;
            case "*":
                System.out.println((x*y)+"\n");
                break;
            case "/":
                System.out.println((x/y)+"\n");
                break;
            }
        }
    }
}
