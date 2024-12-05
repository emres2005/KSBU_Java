import java.time.*;

public class indirim {
    public static void main(String[] args) {
        LocalDate calendar = LocalDate.now();
        int day = calendar.getDayOfWeek().getValue();
        double discMultiplier;
        double costTshirt = 100;
        double costVest = 200;
        switch(day){
            case 1:
                discMultiplier = 0.6;
                break;
            case 3:
                discMultiplier = 0.4;
                break;
            default:
                discMultiplier = 1;
        };
        System.out.println("İndirimli t-shirt fiyatı: " + costTshirt*discMultiplier);
        System.out.println("İndirimli hırka fiyatı: " + costVest*discMultiplier);
    }
}
