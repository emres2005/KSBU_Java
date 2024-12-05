import java.io.Console;
public class metin {
	public static void main (String[] arg) {
	Console x = System.console();
	String metin = x.readLine("mesaj girin: ");
	System.out.println("mesajınız: " + metin);
	System.out.println("metin string mi? " + metin instanceof String);
	};
};