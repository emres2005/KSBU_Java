package VY_sinava_hazirlik;

public class Main {

    public static void main(String[] args) {
        GenericLinkedList list = new GenericLinkedList();
        list.add(12);
        list.add(45.4684f);
        list.add(13);
        list.add("Bursa");
        list.add(14.79846132);
        list.pop();
        //list.remove(1);
        list.print();
        System.out.println("\n"+list.index(2).value);
        System.out.println(list.index(2).prev.value);
    }
}
