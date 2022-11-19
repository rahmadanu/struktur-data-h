package queue;

public class QueueMain {

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        queue.display();
        System.out.println("front: " + queue.front());
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("clearing...");
        queue.clear();
        System.out.println("cleared:\n");
        System.out.println("insert after clearing: " + queue.insert(3));
        queue.display();

    }
}
