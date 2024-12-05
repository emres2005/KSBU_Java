package apps;

public class applist {
    public static void main(String[] args) {
        App wacup = new App("WACUP","1.9.20.17040","Darren Owen");
        App brave = new App("Brave","120.1.61.101","Brave Software Inc.");
        App sevenzip = new App("7-zip","23.01","Igor Pavlov");
        wacup.Info();
        brave.Info();
        sevenzip.Info();
    }
}
