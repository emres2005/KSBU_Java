package apps;

public class appman {
    public String Name, Ver, Publisher;
    public static void main(String[] args){
        appman app = new appman();
        app.remove("Chrome", "121.0.6167.8");
        app.install("Audacity","3.3.3");
    }
    void install(String Name,String Ver){
        this.Name = Name;
        this.Ver = Ver;
        System.out.println(Name +' '+ Ver + " indiriliyor...");
    }
    void remove(String Name,String Ver){
        this.Name = Name;
        this.Ver = Ver;
        System.out.println(Name +' '+ Ver + " kaldırılıyor...");
    }
    
    
}
