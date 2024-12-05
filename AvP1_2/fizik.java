import java.util.Scanner;

public class fizik {
    public static void main (String[] args){
        Scanner keyInput = new Scanner(System.in);
        double k = 8.99 * Math.pow(10, 9);
        System.out.println("Parçacığın yükünü girin: ");
        double q = keyInput.nextDouble();
        System.out.println("Parçacığın uzaklığını girin: ");
        double d = keyInput.nextDouble();
        double E = k * (q / (d*d));
        System.out.println("Elektrik Alan = " + E);
        aki(E,keyInput);
        keyInput.close();
    }

    public static void aki(double E, Scanner keyInput){
        System.out.println("Elektriksel Akıyı da hesaplamak istiyor musunuz? (E/H)");
        String karar = keyInput.nextLine().toUpperCase();
        switch (karar) {
            case "E":
                System.out.println("Akının geçtiği yüzey Alanını girin: ");
                double A = keyInput.nextDouble();
                System.out.println("Bu yüzeyin dikeyle yaptığı açıyı girin: ");
                double theta = keyInput.nextDouble();
                double phi = E * A * Math.cos(Math.toRadians(theta));
                System.out.println("Elektriksel Akı = " + phi);
                break;
            case "H":
                break;
            default:
                aki(E,keyInput);
            }
    }
}