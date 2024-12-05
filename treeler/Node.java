package treeler;

public class Node <T>{
    T value;
    Node left;
    Node right;

    Node(T value) {
        this.value = value;
        right = null;
        left = null;
    }
}
