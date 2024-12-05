package liskov;

public class dortgen extends sekil{
    private Double height, width;
    
    public dortgen(Double h, Double w){
        height = h;
        width = w;
    }
    @Override
    public Double alanHesapla(){
        return height * width; 
    }
    @Override
    public void bilgiGoruntule(){
        System.out.println("Dörtgen \nYükseklik: "+height+"\nGenişlik: "+width);
    }
}