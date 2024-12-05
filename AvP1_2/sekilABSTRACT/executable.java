package sekilABSTRACT;

public class executable {
    public static void main(String[] args) {
        sekil[] sekiller = new sekil[2];
        sekiller[0] =  new ucgen();
        sekiller[1] = new kare();

        for (sekil sekil : sekiller) {
            sekil.draw();
        }
    }
}
