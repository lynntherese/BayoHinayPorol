public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree tree= new BinarySearchTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(8);
        tree.insert(20);
        System.out.println("In-order Traversal:");
        tree.inOrder(tree.root);
        System.out.println("\nPre-order Traversal:");
       tree.preOrder(tree.root);
       System.out.println("\nPost-order Traversal:");
        tree.postOrder(tree.root);
    
    }
}
