package composition;

class araba {
    private String marka;
    private String model;
    private motor motor;
    private direksiyon direksiyon;
    public araba(String marka,String model,motor motor,direksiyon direksiyon){
        this.marka = marka;
        this.model = model;
        this.motor = motor;
        this.direksiyon = direksiyon;
    }
    public void gaz(){
        motor.calistir();
        System.out.println(marka+' '+model+" harekete geçti.");
    }
    public void don(String yon){
        switch(yon){
            case "R":
                direksiyon.sagaDon();
                break;
            case "L":
                direksiyon.solaDon();
                break;
            default:
                System.out.println("Yön bilgisi yok.");
        }
    }
}
class motor{
    @SuppressWarnings("unused")
    private String motorTipi;
    public motor(String motorTipi){
        this.motorTipi = motorTipi;
    }
    public void calistir(){
        System.out.println("Motor çalıştırılıyor...");
    }
}
class direksiyon{
    public void sagaDon(){
        System.out.println("Araba sağa döndürülüyor.");
    }
    public void solaDon(){
        System.out.println("Araba sola döndürülüyor.");
    }
}
