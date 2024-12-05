package BinarySearchTrees;

public class BinarySearchTree2 {
    Node Root;

    public BinarySearchTree2()
    {
        this.Root=null;
    }

    public boolean Add(int value)
    {
        Node temp=new Node(value);
        boolean result=this.Add(temp);
        return result;
    }

    private boolean Add(Node tNode)
    {
        if(Root==null)
        {
            this.Root=tNode;
            return true;
        }
        else
        {
            Node current=this.Root;
            while(true)
            {
                if(tNode.getData() == current.getData())
                {
                    return false; //No duplicate
                }
                else if(tNode.getData() > current.getData())
                {
                    if(current.getRightChild()==null)
                    {
                        current.setRightChild(tNode);
                        break;
                    }
                    else{
                        current=current.getRightChild();
                    }
                }
                else if(tNode.getData() < current.getData())
                {
                    if(current.getLeftChild()==null)
                    {
                        current.setLeftChild(tNode);
                        break;
                    }
                    else{
                        current=current.getLeftChild();
                    }
                }
            }//END-OF-WHILE
        }
        return true;
    }

    public boolean remove(Node tNode)
    {
       if(find(tNode)){
           
       }
    }

    public void PreOrderTreversal(Node root){
        System.out.println(root.getData());
        PreOrderTreversal(root.getLeftChild());
        PreOrderTreversal(root.getRightChild());
    }

    public boolean find(Node tNode) {
        while (true) {
            if (tNode.getData() == Root.getData()) {
                return true;
            } else if (tNode.getData() > Root.getData()) {
                if (Root.getRightChild() == null) {
                    System.out.println("Not Found");
                    break;
                } else {
                    Root = Root.getRightChild();
                }
            } else if (tNode.getData() < Root.getData()) {
                if (Root.getLeftChild() == null) {
                    System.out.println("Not Found");
                    break;
                } else {
                    Root = Root.getLeftChild();
                }
            }
        }
        return false;
    }
}