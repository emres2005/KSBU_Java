import java.util.*;

public class exec {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        List<Character> v = new Vector<>();
        
        al.add("Elma");
        al.addFirst("Armut");
        al.addLast("Kiraz");
        al.add("null");
        System.out.println(al.hashCode());
        al.remove("null");
        System.out.println(al.size());
        al.clear();
        System.out.println(al.isEmpty());
        al.add("Karpuz");
        al.add("Çay");
        al.add("Muz");
        al.add("Çilek");
        al.add("Ayva");
        al.add("Vişne");
        al.add("Ananas");
        al.add("Limon");
        al.add("Hindistan Cevizi");
        al.add("null");//8

        ll.add(1);
        ll.add(2);
        ll.addFirst(0);
        ll.addLast(5);
        ll.add(3);
        ll.add(4);
        System.out.println(ll.size());
        System.out.println(ll.hashCode());
        ll.clear();
        System.out.println(ll.isEmpty());
        System.out.println(ll.contains(4));
        ll.add(216);
        ll.add(240);
        ll.add(360);
        ll.add(420);
        ll.add(500);
        ll.add(512);
        ll.add(540);
        ll.add(1024);
        ll.add(8192);
        ll.add(9000);//8

        v.add('e');
        v.add('k');
        v.addFirst('a');
        v.addLast('z');
        System.out.println(v.size());
        System.out.println(v.hashCode());
        v.clear();
        System.out.println(v.isEmpty());
        v.add('t');
        v.add('w');
        v.add('r');
        v.add('s');
        v.add('v');
        v.add('i');
        v.add('b');
        v.add('g');
        v.add('c');
        v.add('y');//7

        ListeYazdir(al);
        ListeYazdir(ll);
        ListeYazdir(v);
    }
    public static <T> void ListeYazdir(List<T> l){
        for (T i : l) {
            System.out.println(i);
        }
    }
}
