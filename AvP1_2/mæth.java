public class mæth {
    public static void main(String[] args){
        long y=5,x=10;
        System.out.println(x + "+" + y + "=" + Math.addExact(x, y));
        System.out.println(x + "-" + y + "=" + Math.subtractExact(x, y));
        System.out.println(x + "/" + y + "=" + Math.divideExact(x, y));
        System.out.println(x + "*" + y + "=" + Math.multiplyExact(x, y));
        System.out.println("x-- = " + Math.decrementExact(x));
        System.out.println("x++ = " + Math.incrementExact(x));
    }
}
