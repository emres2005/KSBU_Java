public class notGizle {
    public static void main(String[] args) {
        int[] notlar = {12,65,87,32,54,97,48,84,30,98,95};
        for(int i=0 ; i < notlar.length ; i++){
            int not = notlar[i];
            if(not<50){
                System.out.println("Notu düşük");
                continue;
            }
            System.out.println(i + ". Öğrenci'nin Notu: " + not);
        }
    }
}
