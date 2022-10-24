package linkedlist;

public class DLL {

    private Node head;
    private Node tail;

    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (tail == null) {
            tail = head;
        }
        if (head != null) {
            head.prev = node; // first time insertion
        }
        head = node;
        size++;
    }

    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.prev = tail;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertMiddle(int val, int position) {
        if (position == 0) {
            insertFirst(val);
        }
        if (position == size - 1) {
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.prev = temp;
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteLast() {
        if (tail == null) {
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void deleteMiddle(int position) {
        if (position == 0) {
            deleteFirst();
            return;
        }
        if (position == size - 1) {
            deleteLast();
            return;
        }
        Node cur = head;
        if (cur == null) {
            return;
        }
        for (int i = 0; i < position - 1; i++) {
            cur = cur.next;
        }
        Node del = cur.next;
        Node afterDel = del.next;
        cur.next = afterDel;
        afterDel.prev = cur;
        del = null;
        size--;
    }
    public void display() {
        Node node = head;
        Node tail = null;
        while (node != null) {
            tail = node;
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
        while (tail != null) {
            System.out.print(tail.val + " -> ");
            tail = tail.prev;
        }
        System.out.println("null");
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
