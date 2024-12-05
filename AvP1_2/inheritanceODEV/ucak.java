package inheritanceODEV;

public class ucak extends binek {
    @SuppressWarnings("unused")
    private String aracTipi,yolTipi,motorTipi,sahibi,marka,model;
    public ucak(String aracTipi,String yolTipi,String motorTipi,String sahibi,String marka,String model){
        super(aracTipi, yolTipi, motorTipi);
        this.sahibi = sahibi;
        this.marka = marka;
        this.model = model;
    }
    public void kalkis(String sahibi){
        System.out.println(this.sahibi+" iyi uçuşlar diler");
    }
    public void inis(){
        System.out.println("Uçak başarıyla indi. \n-Şak şak şak şak");
    }
    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
}
