package bankacilik;

public class bankacilik {
    public static void main(String[] args) {
        tasarrufHesap tHesap = new tasarrufHesap(720);
        tHesap.paraCek(420);
        tHesap.paraYatir(360);
        tHesap.bakiyeSorgula();

        cariHesap cHesap = new cariHesap(2000);
        cHesap.paraCek(404);
        cHesap.paraYatir(1024);
        cHesap.bakiyeSorgula();

        vadeliHesap vHesap = new vadeliHesap(9000,6);
        vHesap.paraCek(777);
        vHesap.paraYatir(2013);
        vHesap.bakiyeSorgula();

        yatirimHesap yHesap = new yatirimHesap(24000);
        yHesap.paraYatir(250);
        yHesap.paraCek(7840);
        yHesap.bakiyeSorgula();
        yHesap.hisseAl("BIMAS", 3, 373);
        yHesap.hisseSat("BIMAS", 2, 383);
    }
}
