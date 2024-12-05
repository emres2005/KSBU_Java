package BinarySearchTrees;

public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;
    public Node(int data) {
        this.data = data;
        this.setLeftChild(null);
        this.setRightChild(null);
    }
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    public int getData() {
        return data;
    }
    public Node getLeftChild() {
        return leftChild;
    }
    public Node getRightChild() {
        return rightChild;
    }
}
