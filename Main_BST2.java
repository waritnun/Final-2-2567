public class Main_BST2 {
    public static void main(String[] args) {
        BinarySearchTree_BST2 tree = new BinarySearchTree_BST2();
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(2);
        tree.add(7);
        tree.add(6);
        tree.remove(2);

        tree.remove(5);
        tree.remove(10);

        System.out.println(tree.getMax());
        System.out.println(tree.nnodes(tree.root));
        tree.printInOrder(tree.root);
    }
}
