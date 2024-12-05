public class araba {
    String name="TOGG";
    String color="Gemlik";
    public static void main(String[] args){
        araba car = new araba();
        System.out.println(car.name +' '+ car.color);
        araba.assemble();
        araba.spray();
    }
    static void assemble(){
        System.out.println("Araba birleştiriliyor.");
    }
    static void spray(){
        System.out.println("Araba boyanıyor.");
    }
}
