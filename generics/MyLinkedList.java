package generics;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyLinkedList <T> {
    Node Head;
    Node Tail;
    int elementNumber;

    public MyLinkedList() {
        Head=null;
        Tail=null;
        elementNumber=0;
    }

    public boolean add(T object, int position)
    {
        //Check if list has enoguh node for adding particular position
        if(position<=this.elementNumber && position>=0)
        {
            Node temp=new Node(object);
            this.add(temp, position);
            return true;
        }
        else
        {
            System.err.println("Position out of range for List");
            return false;
        }
    }

    private void add(Node tNode, int position)
    {
        if(this.Head==null && position == 0)
        { //List is empty and position is zero
            this.Head=tNode;
            this.Tail=tNode;
        }
        else if(this.Head!=null && position==0)
        { //List is not empty add node at position zero (Head)
            tNode.setNext(this.Head);
            this.Head=tNode;
        }
        else if(this.Head!=null && position==this.elementNumber)
        {//Add node to the tail
            Tail.setNext(tNode);
            Tail=tNode;
        }
        else if(position!=this.elementNumber && position!=0)
        {
            Node temp=this.Head;
            Node temp2;

            for(int i=0; i<position-1; i++)
            {
                temp=temp.getNext();
            }
            temp2=temp.getNext();

            temp.setNext(tNode);
            tNode.setNext(temp2);
        }
        else
        { //Unhandled Scenario
            System.err.println("Unhandled Case");
            try {
                throw new Exception("Unhandled Case");
            } catch (Exception ex) {
                Logger.getLogger(MyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.elementNumber--;
        }
        this.elementNumber++;
    }

    public void add(T object)
    {
        Node temp= new Node(object);
        this.add(temp);
        elementNumber++;
    }

    private void add(Node tNode)
    {
        //Scenario 1: No node
        if(this.Head==null && this.Tail==null)
        {
            this.Head=tNode;
            this.Tail=tNode;
        }
        else
        {//Scenario 3: Multiple node
            this.Tail.setNext(tNode);
            this.Tail=tNode;
        }
    }


    //Print
    public void printList()
    {
        Node temp=this.Head;
        while(true)
        {
            if(this.Head==null)
            {
                System.out.println("List is empty");
                break;
            }
            else
            {
                System.out.print(temp.getData()+ " - ");
                temp=temp.getNext();
            }
            if(temp==null)
            {
                System.out.println();
                break;
            }
        }
    }
}
