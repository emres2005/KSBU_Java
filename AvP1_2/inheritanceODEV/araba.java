package inheritanceODEV;

public class araba extends binek {
    @SuppressWarnings("unused")
    private String aracTipi,yolTipi,motorTipi,plaka,marka,model;
    public araba(String aracTipi,String yolTipi,String motorTipi,String plaka,String marka,String model){
        super(aracTipi, yolTipi, motorTipi);
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
    }
    public void gaz(String marka, String model){
        System.out.println(this.marka+' '+this.model+" ivmeleniyor");
    }
    public void fren(String marka,String model){
        System.out.println(this.marka+' '+this.model+" yavaşlıyor");
    }
    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
}
