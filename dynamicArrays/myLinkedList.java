package dynamicArrays;

public class myLinkedList {
    Node head;
    Node tail;
    int size;
    public myLinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    public static void main(String[] args) {
        myLinkedList list = new myLinkedList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);
        list.print();
        list.add(25,4);
        list.print();
    }
        //TODO remove() METHODLARINI YAZ ÖDEV
    public void remove(int index){
        Node node = new Node(index);
        remove(node);
    }


    private void remove(Node node){
//        while(true){
//            Node temp0 = head;
//            Node temp1;
//            for (int i = 0; i < Node.getData()-1; i++) {
//                temp0 = temp0.getNext();
//            }
//            temp0 = temp1.getNext();
//
//            Node.setNext(temp0);
//            temp0.setNext(temp1);
//        }
    }

    public void add(int input, int index){
        if(index<=size && index>=0){
            Node temp = new Node(input);
            this.add(temp,index);
        }
    }

    private void add(Node temp,int index){
        if(index==0 && head==null){
            head = temp;
            tail = temp;
        }
        else if(index==0 && head!=null){
            temp.setNext(head);
            head = temp;
        }
        else if(index==size && head!=null){
            tail.setNext(temp);
            tail = temp;
        } else if (index!=size && index!=0) {
            Node temp0 = head;
            Node temp1;
            for (int i = 0; i < index-1; i++) {
                temp0 = temp0.getNext();
            }
            temp1 = temp0.getNext();

            temp0.setNext(temp);
            temp.setNext(temp1);
        }
        size++;
    }

    public void add(int num){
        Node temp = new Node(num);
        this.add(temp);
        size++;
    }

    private void add(Node temp){
        if (head==null && tail==null){
            head = temp;
            tail = temp;
        }else {
            tail.setNext(temp);
            tail = temp;
        }
    }

    public void print(){
        Node temp = head;
        while(true){
            if(temp==null){
                System.out.println("The list is empty");
                break;
            }else {
                System.out.print(temp.getData()+" ");
                temp = temp.getNext();
            }if(temp == null){
                System.out.println();
                break;
            }
        }
        System.out.println("Array Size: "+size);
    }

}

class Node{
    private Node next;
    private int data;

    public Node(int num){
        next = null;
        data = num;
    }

    public  void setNext(Node nextNode){
        next = nextNode;
    }
    public void setData(int inputData){
        data = inputData;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
}