package inheritance3;

public class arac {
    public String plakaNo,model;
    public arac(String plakaNo){
        this.plakaNo = plakaNo;
        System.out.println(this.plakaNo+" plakalı araç oluştu.");
    }
    public void motorCalistir(String model){
        this.model = model;
        System.out.println(this.plakaNo+" plakalı "+this.model+" çalıştı.");
    }
    
}
