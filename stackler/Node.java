package stackler;

public class Node {
    private Node next;
    private Node prev;
    private int data;

    public Node(int num){
        next = null;
        data = num;
    }

    public void setNext(Node temp0){
        next = temp0;
    };
    public Node getNext() {
        return next;
    };
    public void setPrev(Node temp1){
        prev = temp1;
    }
    public Node getPrev() {
        return prev;
    }
    public int getData(){
        return data;
    }
}