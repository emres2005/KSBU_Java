package exception;

public class hataIzleme {
    public static void main(String[] args) {
        Exception ex1 = new Exception("Hata 1");
        StackTraceElement[] hataIzleme = ex1.getStackTrace();
        for (StackTraceElement ste : hataIzleme) {
            System.out.println(ste.toString());
            System.out.println("Hata Dosyası: "+ste.getFileName());
            System.out.println("Hata Satırı: "+ste.getLineNumber());
            System.out.println("Hata metodu: "+ste.getMethodName());
            System.out.println("Hata Sınıfı: "+ste.getClass());
        }

        try {
            @SuppressWarnings("unused")
            int sonuc = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Sonsuz "+e.getMessage());
        } finally {
            System.out.println("Toplama işlemi tamamlandı.");
        }
    }
}
