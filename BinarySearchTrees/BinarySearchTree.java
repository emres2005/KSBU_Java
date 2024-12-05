package BinarySearchTrees;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        root = null;
    }
    private boolean add(Node tNode){
        if(root==null){
            this.root= tNode;
        }else{
            Node current = root;
            Node parent = null;
            while(current != null){
                parent = current;
                if(tNode.getData() == current.getData()){
                    return false;
                }
                else if(tNode.getData() < current.getData()){
                    current = current.getLeftChild();
                    if(current == null){
                        parent.setLeftChild(tNode);
                        return true;
                    }
                }else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(tNode);
                        return true;
                    }
                }
            }
        }
        return true;
    }
    public boolean add(int value){
        Node tNode = new Node(value);
        return add(tNode);
    }
}
