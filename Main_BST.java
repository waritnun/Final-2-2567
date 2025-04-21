//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_BST {
    public static void main(String[] args) {
        BinarySearchTree_BST BST = new BinarySearchTree_BST();
        BST.add(5);
        BST.add(7);
        BST.add(1);
        BST.add(3);
        BST.add(3);
        BST.add(9);
        BST.add(6);
        BST.printInOrder(BST.root);
        BST.remove(1);
        System.out.print("\n");
        BST.printInOrder(BST.root);
        System.out.print("\n");
        System.out.println("อยู่มั้ย: " + BST.contain(5));
        System.out.println("อยู่มั้ย: " + BST.contain(2));
        BST.getMax();
        BST.getMin();
    }
}