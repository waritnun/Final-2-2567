public class BinarySearchTree_BST {
    BTNode_BST root;
    public BinarySearchTree_BST(){
        this.root = null;
    }
    public void add(Object data){
        BTNode_BST newnode = new BTNode_BST(data);
        if (root == null){
            root = newnode;
        }
        else {
            BTNode_BST pre = null;
            BTNode_BST current = root;
            boolean contains = false;
            while (current != null) {
                pre = current;
                if((int) data == (int) current.data){
                    contains = true;
                    break;
                }
                else if ((int) data < (int) current.data){
                    current = current.left;
                }
                else if ((int) data > (int) current.data){
                    current = current.right;
                }
            }
            if(contains){
                System.out.println("ซ้ำคับอ้วน");
            }
            else if ((int) data < (int) pre.data) {
                pre.left = newnode;
            } else {
                pre.right = newnode;
            }
        }
    }
    public void remove(Object data){
        if (root == null){
            System.out.println("ไม่มีข้อมูลให้ลบ");
            return;
        }

        BTNode_BST parent = null;
        BTNode_BST current = root;

        // ✅ หาตัวที่จะลบ
        while (current != null && (int) current.data != (int) data) {
            parent = current;
            if ((int) data < (int) current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("ไม่พบข้อมูลในต้นไม้");
            return;
        }

        // ✅ กรณี 1: ไม่มีลูกเลย
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (parent.left == current) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

        // ✅ กรณี 2: มีลูกแค่ข้างขวา
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (parent.left == current) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }

        // ✅ กรณี 3: มีลูกแค่ข้างซ้าย
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (parent.left == current) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }

        // ✅ กรณี 4: มีลูกทั้งซ้ายและขวา
        else {
            // หา Successor (ตัวที่เล็กสุดในฝั่งขวา)
            BTNode_BST successorParent = current;
            BTNode_BST successor = current.right;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            // แทนค่าที่จะลบด้วยค่าของ successor
            current.data = successor.data;

            // ลบ successor ตัวจริง
            if (successorParent.left == successor) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }
        }
    }

    public boolean contain (Object data){
        BTNode_BST current = root;
        while(current != null){
            if((int) current.data == (int)data) return true;
            else if((int) current.data > (int)data) current = current.left;
            else if((int) current.data < (int)data) current = current.right;
        }
        return false;
    }
    public void getMax(){
        BTNode_BST current = root;
        BTNode_BST pre = null;
        if (root == null) System.out.println("ไม่มีค่า");
        else {
            while (current != null) {
                pre = current;
                current = current.right;
            }
            System.out.println("ค่ามากสุด: " + (int)pre.data);
        }
    }
    public void getMin(){
        BTNode_BST current = root;
        BTNode_BST pre = null;
        if (root == null) System.out.println("ไม่มีค่า");
        else {
            while (current != null) {
                pre = current;
                current = current.left;
            }
            System.out.println("ค่าน้อยสุด: " + (int)pre.data);
        }
    }
    public void printInOrder(BTNode_BST root) {
        if (root != null) {
            printInOrder(root.left);       // ไปทางซ้ายก่อน
            System.out.print(root.data + " ");  // พิมพ์ข้อมูลตรงนี้
            printInOrder(root.right) ;      // แล้วค่อยไปทางขวา
        }
    }

}
