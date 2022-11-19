package queue;

public class QueueMain {

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        queue.display();
        System.out.println(queue.remove());
        queue.display();

    }
}
