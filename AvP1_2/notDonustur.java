import java.util.Scanner;
public class notDonustur {
	public static void main (String[] arg) {
	Scanner keyInput = new Scanner(System.in);
	System.out.println("100 üzerinden notu girin:");
	int not = keyInput.nextInt();
	if(not>89) {
		System.out.println("AA");
	}else if(not>79 && not<90) {
		System.out.println("BA");
	}else if(not>69 && not<80) {
		System.out.println("BB");
	}else if(not>64 && not<70) {
		System.out.println("CB");
	}else if(not>59 && not<65) {
		System.out.println("CC");
	}else if(not>0 && not<60) {
		System.out.println("FF");
	}
	keyInput.close();
	};
};