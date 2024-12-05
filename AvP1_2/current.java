import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class current {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime combined = LocalDateTime.now();
        System.out.println("tarih: " + date);
        System.out.println("\n zaman: " + time);
        System.out.println("\n beraber: " + combined);
    }
}
