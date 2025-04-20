//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_linkedlist {
    public static void main(String[] args) {
        LinkedCollection_l l = new LinkedCollection_l();
        l.add(4);
        l.add(5);
        l.add(9);
        l.add(1);
        l.add(9);
        l.add(2);   
        l.remove(5);
        l.remove(3);
        l.printlist();
    }
}