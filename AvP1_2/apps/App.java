package apps;

public class App {
    public String Name, Ver, Publisher;

    public App(String Name, String Ver, String Publisher) {
        this.Name = Name;
        this.Ver = Ver;
        this.Publisher = Publisher;
    }

    public void Info(){
        System.out.println(Name +' '+ Ver + " by " + Publisher);
    }
}
