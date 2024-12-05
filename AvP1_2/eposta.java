import java.util.Scanner;
public class eposta{
	@SuppressWarnings("unused")
	public static void main(String[] args){
		Scanner keyInput = new Scanner(System.in);
		System.out.println("Gönderilecek e-posta sayısı:");
		int count = keyInput.nextInt();
		for (int i=0; i<count; i++){
		System.out.println("Gönderenin e-posta adresini giriniz:");
		String sender = keyInput.next();
		System.out.println("Alıcının e-posta adresini giriniz:");
		String receiver = keyInput.next();
		System.out.println("Mesajı giriniz:");
		String msg = keyInput.next();
		System.out.println("E-posta gönderildi!");
		};
		keyInput.close();
	};
};