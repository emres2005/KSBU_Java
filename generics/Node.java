package generics;

public class Node <T> {
    private Node next; //Bir sonraki düğümü gösteren referans
    private T data; // Veri

    public Node(T object) {
        this.next=null;
        this.data=object;
    }


    public void setNext(Node nextNode)
    {
        this.next=nextNode;
    }

    public void setData(T object)
    {
        this.data=object;
    }
    public T getData()
    {
        return this.data;
    }
    public Node getNext()
    {
        return this.next;
    }
}