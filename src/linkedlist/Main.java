package linkedlist;

public class Main {

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertLast(3);
        list.insertMiddle(4, 3);
        list.insertMiddle(5, 3);
        list.deleteFirst();
        list.deleteLast();
        list.insertLast(7);
        list.deleteMiddle(1);
        list.updateMiddle(9, 1);
        list.updateFirst(8);
        list.updateLast(10);
        System.out.println(list.find(10));
        list.display();
    }
}
