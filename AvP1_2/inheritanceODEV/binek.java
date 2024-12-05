package inheritanceODEV;

public class binek {
    public String aracTipi,yolTipi,motorTipi;
    public binek(String aracTipi,String yolTipi,String motorTipi){
        this.aracTipi = aracTipi;
        this.yolTipi = yolTipi;
        this.motorTipi = motorTipi;
    }
    final String genelTip = "Binek Araç";
    public void bin(String aracTipi){
        System.out.println(this.aracTipi+" aracına binildi");
    }
    final void info(String aracTipi){
        System.out.println("Araç: "+ aracTipi +"\nGittiği yol tipi: "+ yolTipi +"\nMotor Tipi: "+ motorTipi);
    }
    public void in(String aracTipi){
        System.out.println(this.aracTipi+" aracından inildi");
    }
}