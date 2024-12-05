package BinarySearchTrees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(5);
        bst.add(15);
        System.out.println("END");
        BinarySearchTree2 bst2 = new BinarySearchTree2();
        bst2.Add(10);
        bst2.Add(5);
        bst2.Add(15);
        System.out.println("END");
        bst2.PreOrderTreversal(bst2.Root);
    }
}
