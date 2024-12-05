package composition;

public class main0 {
    public static void main(String[] args) {
        araba araba = new araba("Togg", "T10X", new motor("160 kW"), new direksiyon());
        araba.gaz();
        araba.don("R");
    }
}
