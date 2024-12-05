import java.util.Scanner;
public class ucgenCesidi {
	public static void main (String[] arg) {
	Scanner keyInput = new Scanner(System.in);
	System.out.println("1. Kenarı girin:");
	double k1 = keyInput.nextInt();
	System.out.println("2. Kenarı girin:");
	double k2 = keyInput.nextInt();
	System.out.println("3. Kenarı girin:");
	double k3 = keyInput.nextInt();
	if(k1==k2 && k2==k3) {
		System.out.println("Üçgenin türü eşkenar.");
	}else if(k1==k2 || k2==k3) {
		System.out.println("Üçgenin türü ikizkenar.");
	}else{
		System.out.println("Üçgenin türü çeşitkenar.");
	}
	keyInput.close();
	};
};