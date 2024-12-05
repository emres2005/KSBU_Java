package inheritanceODEV;

public class gemi extends binek {
    @SuppressWarnings("unused")
    private String aracTipi,yolTipi,motorTipi,malzeme,ad,gemiTipi;
    public gemi(String aracTipi,String yolTipi,String motorTipi,String malzeme,String ad,String gemiTipi){
        super(aracTipi, yolTipi, motorTipi);
        this.malzeme = malzeme;
        this.ad = ad;
        this.gemiTipi = gemiTipi;
    }
    public void ileri(){
        System.out.println("Yelkenler fora");
    }
    public void top(){
        System.out.println("Ateş!");
    }
    public String getGemiTipi(){
        return gemiTipi;
    }
    public String getAd(){
        return ad;
    }
}
