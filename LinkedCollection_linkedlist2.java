public class LinkedCollection_linkedlist2 implements SortCollection_linkedlist2 {
    MyNode_linkedlist2 head;
    public LinkedCollection_linkedlist2(){
        this.head = null;
    }
    @Override
    public void add(Object data){
        MyNode_linkedlist2 newnode = new MyNode_linkedlist2(data);
        if(head == null){
            head = newnode;
        }
        else{
            MyNode_linkedlist2 pre = null;
            MyNode_linkedlist2 current = head;
            while (current != null && (int)current.data <= (int)data) {
                if ((int) data == (int) current.data) {
                    System.out.println("มีละจ้า");
                    return;
                }
                pre = current;
                current = current.next;
            }
            newnode.next = current;

            if (pre == null){
                head = newnode;
            }
            else pre.next = newnode;
        }
    }

    @Override
    public void remove(){
        MyNode_linkedlist2 current = head;
        MyNode_linkedlist2 pre = null;
        while (current.next.next != null){
            pre = current;
            current = current.next;
        }
        pre.next = current.next;
        current.next = current.next.next;

    }

    public void printlist(){
        MyNode_linkedlist2 current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("\n");
    }
}
