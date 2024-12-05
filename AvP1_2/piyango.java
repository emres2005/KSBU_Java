import java.util.ArrayList;
import java.util.Scanner;

public class piyango {
    public static void main(String[] args){
        int piy = (int) (1000000*Math.random());
        Scanner enter = new Scanner(System.in);
        System.out.println("Piyango numaranızı girin: "+piy);
        int usrNums = enter.nextInt();
        
        int temp = piy;
        ArrayList<Integer> piyArrayList = new ArrayList<Integer>();
        while  (temp > 0){
            piyArrayList.add(temp % 10);
            temp /= 10;
        } ;

        int temp0 = usrNums;
        ArrayList<Integer> usrArrayList = new ArrayList<Integer>();
        while  (temp0 > 0){
            usrArrayList.add(temp % 10);
            temp0 /= 10;
        } ;

        for (int i = 0; i < 6; i++) {
            if (usrArrayList.contains(piyArrayList.get(i)) && piyArrayList.get(i) != 0) {
                System.out.println((i + 1) + ". hane tutmuş.");
            }
        }
        enter.close();
    }
}
