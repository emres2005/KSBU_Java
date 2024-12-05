package VY_sinava_hazirlik;

public class Node <T> {
    T value;
    Node<T> next;
    Node<T> prev;
    int index;
    Node(T value) {
        this.value = value;
        next = null;
        prev = null;
        index = 0;
    }

    Node<T> getNext(){
        return this.next;
    }

    Node<T> getPrev(){
        return this.prev;
    }
}
