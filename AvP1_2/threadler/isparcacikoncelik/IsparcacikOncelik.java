package threadler.isparcacikoncelik;

public class IsparcacikOncelik {
    public static void main(String[] args) {
        Test test0 = new Test("1. iş parçacığı => ");
        Test test1 = new Test("2. iş parçacığı => ");
        Thread thread0 = new Thread(test0);
        Thread thread1 = new Thread(test1);
        thread0.start();
        thread1.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Hata");
        }
        System.out.println("Thread bitti.");
    }
}
