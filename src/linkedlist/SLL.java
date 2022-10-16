package linkedlist;

public class SLL {

    private Node head;
    private Node tail;

    private int size;

    public SLL() {
        this.size = 0;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertMiddle(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
        size--;
    }

    public void deleteMiddle(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size-1) {
            deleteLast();
        }
        Node prev = get(index - 1);
        prev.next = prev.next.next;
        size--;
    }

    public void updateFirst(int value) {
        Node node = head;
        node.value = value;
    }

    public void updateLast(int value) {
        Node node = tail;
        node.value = value;
    }
    public void updateMiddle(int value, int index) {
        if (index == 0) {
            updateFirst(value);
            return;
        }
        if (index == size - 1) {
            updateLast(value);
        }
        Node node = get(index);
        node.value = value;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }
}
