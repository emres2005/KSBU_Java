package inheritanceODEV;

public class bisiklet extends binek {
    @SuppressWarnings("unused")
    private String aracTipi,yolTipi,motorTipi,tekerYaricapi,marka,model;
    public bisiklet(String aracTipi,String yolTipi,String motorTipi,String tekerYaricapi,String marka,String model){
        super(aracTipi, yolTipi, motorTipi);
        this.tekerYaricapi = tekerYaricapi;
        this.marka = marka;
        this.model = model;
    }
    public void vitesDusur(String marka,String model){
        System.out.println(this.marka+' '+this.model+" yokuş yukarı gidiyor, vites düşürüldü");
    }
    public void zil(){
        System.out.println("zillr zillr zillr");
    }
    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
}
