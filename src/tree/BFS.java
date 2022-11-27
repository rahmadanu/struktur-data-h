package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
    public static Tree search(int value, Tree root) {
        Queue<Tree> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            System.out.print("Current queue: ");
            for (Tree item : queue) {
                System.out.print(item.getValue() + " ");
            }
            System.out.println();

            Tree currentNode = queue.remove();
            if (currentNode.getValue() == value) {
                System.out.println("Finished searching!");
                return currentNode;
            } else {
                queue.addAll(currentNode.getChildren());
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Tree root = new Tree(10);
        Tree newChild = root.addChild(5);
        root.addChild(7);
        root.addChild(15);
        Tree newChildChild = newChild.addChild(115);
        Tree newChildChildChild = newChildChild.addChild(207);
        Tree newChildChildChildChild = newChildChildChild.addChild(500);

        Tree foundNode = search(500, root);
        if (foundNode != null) {
            System.out.println(foundNode.getValue());
        } else {
            System.out.println("Found nothing!");
        }
    }
}
