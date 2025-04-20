public class LinkedCollection_l implements SortCollection_l {
    MyNode_l head;
    public LinkedCollection_l(){
        this.head = null;
    }
    @Override
    public void add(int data) {
        MyNode_l newnode = new MyNode_l(data);
        if (isempty()){
            head = newnode;
        }
        else if (contains(data)){
            System.out.println(data + " has already existed in List");
        }
        else {
            MyNode_l pre = null;
            MyNode_l current = head;
            while (current != null && current.data < data) {
                pre = current;
                current = current.next;
            }
            newnode.next = current;

            if (pre == null) {
                head = newnode;
            } else {
                pre.next = newnode;
            }
        }

    }

    @Override
    public void remove(int data) {
        if(contains(data)){
            MyNode_l pre = null;
            MyNode_l current = head;
            while (current != null && current.data < data){
                pre = current;
                current = current.next;
            }
            if (pre == null){
                head = current.next;
            }
            else {
                pre.next = current.next;
                current.next = current.next.next;
            }
        }
        else {
            System.out.println("ไม่พบข้อมูลจ้าอ้วน");
        }
    }

    @Override
    public boolean contains(int data) {
        MyNode_l current = head;
        while(current != null){
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean isempty() {
        return head == null ;
    }

    public void printlist(){
        MyNode_l current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("\n");
    }
}
