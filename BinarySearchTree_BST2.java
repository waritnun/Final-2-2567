public class BinarySearchTree_BST2 {
    BTNode_BST2 root;
    public BinarySearchTree_BST2(){
        this.root = null;
    }
    public void add(Object data){
        BTNode_BST2 newnode = new BTNode_BST2(data);
        if(root == null) this.root = newnode; // if root equal null define root as newnode
        else {
            BTNode_BST2 current = root;
            BTNode_BST2 pre = null;
            while (current != null) {
                if ((int) current.data == (int) data) {
                    System.out.println("มีแล้วค้าบอ้วน");
                    return;
                }
                else if ((int) current.data > (int) data) {
                    pre = current;
                    current = current.left;
                } else if ((int) current.data < (int) data) {
                    pre = current;
                    current = current.right;
                }
            }
            if((int)pre.data > (int)data) pre.left = newnode;
            else pre.right = newnode;
        }
    }
    public void remove(Object data){
        if (contain(data)){
            BTNode_BST2 pre = null;
            BTNode_BST2 current = root;
            while (current != null) {
                if ((int)data == (int) current.data){
                    // leaf
                    if (current.left == null && current.right == null){
                        if (current == root) {
                            root = null;
                        } else if (pre.left == current) {
                            pre.left = null;
                        } else {
                            pre.right = null;
                        }
                        return;
                    }
                    // 1 node right node
                    else if (current.left == null){
                        if (current == root) {
                            root = current.right;
                        }
                        else if (pre.left == current){
                            pre.left = current.right;
                        }
                        else pre.right = current.right;
                        return;
                    }
                    // 1 node left node
                    else if (current.right == null){
                        if (current == root) {
                            root = current.left;
                        }
                        else if (pre.left == current){
                            pre.left = current.left;
                        }
                        else pre.right = current.left;
                        return;
                    }
                    // 2 node left by minimum of right
                    else {
                        BTNode_BST2 successorParent = current;
                        BTNode_BST2 successor = current.right;
                        while (successor.left != null) {
                            successorParent = successor;
                            successor = successor.left;
                        }

                        current.data = successor.data;

                        if (successorParent.left == successor) {
                            successorParent.left = successor.right;
                        } else {
                            successorParent.right = successor.right;
                        }
                        return;
                    }
                }
                else if ((int)data < (int) current.data){
                    pre = current;
                    current = current.left;
                }
                else {
                    pre = current;
                    current = current.right;
                }
            }
        }
        else System.out.println("ไม่มีให้ลบจ้า");

    }
    public Object getMax(){
        BTNode_BST2 current = root;
        BTNode_BST2 pre = null;
        while (current != null) {
            pre = current;
            current = current.right;
        }
        return pre.data;
    }
    public int nnodes(BTNode_BST2 node){
        if (node == null) return 0;
        return 1 + nnodes(node.left) + nnodes(node.right);
    }
    public boolean contain(Object data){
        BTNode_BST2 current = root;
        while (current != null){
            if ((int) current.data == (int) data) return true;
            else if((int) current.data > (int) data) current = current.left;
            else current = current.right;
        }
        return false;
    }
    public void printInOrder(BTNode_BST2 root) {
        if (root != null) {
            printInOrder(root.left);       // ไปทางซ้ายก่อน
            System.out.print(root.data + " ");  // พิมพ์ข้อมูลตรงนี้
            printInOrder(root.right) ;      // แล้วค่อยไปทางขวา
        }
    }
}
