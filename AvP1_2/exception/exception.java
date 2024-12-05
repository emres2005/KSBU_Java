package exception;

public class exception {
    public static void main(String[] args) {
        Exception ex1 = new Exception();
        Exception ex2 = new Exception("Hata Mesajı!!!");
        Exception ex3 = new Exception("Hata Mesajı 2!!1!!",ex2);
        Exception ex4 = new Exception(ex3);

        System.out.println(ex1.getMessage());
        System.out.println(ex2.getMessage());
        System.out.println(ex3.getMessage());
        System.out.println(ex4.getMessage());
        ex4.printStackTrace();
    }
}
