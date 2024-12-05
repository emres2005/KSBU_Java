import java.util.*;
import java.util.concurrent.TimeUnit;

public class listeTUI {
    public static void main(String[] args) {
        List<String> list0 = new ArrayList<>();
        Scanner keyInput = new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J");
            System.out.flush();
            for (int i = 0; i < list0.size(); i++) {
                System.out.println("("+(i+1)+") "+list0.get(i));
            }

            System.out.println("\n[E]kle  |  [K]aldır  |  [T]aşı  |  [P]rogramı kapat");
            String karar = keyInput.nextLine().toUpperCase();
            switch (karar) {
                case "E":
                    System.out.println("Eklenecek eleman: ");
                    String e = keyInput.nextLine();
                    list0.add(e);
                    break;

                case "K":
                    System.out.println("Kaldırılacak elemanın numarası: ");
                    
                    try {
                        int k = keyInput.nextInt();
                        list0.remove(k-1);
                    } catch (IndexOutOfBoundsException ex0) {

                        try {
                            System.out.println("Bu numaraya sahip eleman listede yok. Geçerli bir numara girin.");
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException ex1) {
                            Thread.currentThread().interrupt();
                        }

                    } 
                    
                    break;

                case "T":
                        System.out.println("Taşınacak elemanın numarası: ");
                        int t = (keyInput.nextInt() - 1);
                        keyInput.nextLine();
                        System.out.println("[Y]ukarı / [A]şağı ?");
                        char tasi = keyInput.nextLine().toUpperCase().charAt(0);

                        switch (tasi) {
                            case 'Y':
                                String temp = list0.get(t-1);
                                list0.set(t-1, list0.get(t));
                                list0.set(t, temp);
                                break;
                            case 'A':
                                temp = list0.get(t);
                                list0.set(t, list0.get(t+1));
                                list0.set(t+1, temp);
                                break;
                        }
                    break;

                case "P":
                    keyInput.close();    
                    return;
                }
        }while(true);
    }
}