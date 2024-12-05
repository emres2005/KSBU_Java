package VY_sinava_hazirlik;

public class GenericLinkedList <T> {
    Node<T> Head;
    Node<T> Tail;
    int size;
    public GenericLinkedList() {
        Head = null;
        Tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        Node<T> temp = new Node<>(element);
        if (Head == null) {
            Head = temp;
            Tail = temp;
        }else{
            temp.index = Tail.index + 1;
            Tail.next = temp;
            Tail = temp;
            Tail.prev = this.index(Tail.index - 1);
        }
        size++;
    }

    public void remove(int index) {
        Node<T> toRemove = index(index);
        if (toRemove == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }else if (toRemove == Head) {
            Head = Head.next;
            Head.prev = null;
            for (int i = 0; i < size+1; i++) {
                index(i).index -= 1;
            }
        }
        for(int i=0; i<index-1; i++)
        {
            toRemove = toRemove.getNext();
        }
        Tail = Tail.prev;
        Tail.next = null;
    }

    public void pop(){
        if (Tail != null) {
            Tail = Tail.prev;
            Tail.next = null;
            size--;
        }
    }

    public Node<T> index(int index) {
        Node<T> temp = Head;
        for(int i=0; i<size; i++)
        {
            if(index == temp.index){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void print(){
        Node<T> temp = Head;
        for(int i=0; i<size; i++)
        {
            System.out.print(temp.value+ " ");
            temp=temp.getNext();
        }
    }
}
