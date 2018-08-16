import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue {
    public static void main(String args[]) {
        //FIFO order
        java.util.Queue<Integer> queue = new ArrayBlockingQueue<Integer>(3);
        queue.add(2);
        queue.add(3);
        queue.add(7);
        System.out.println("Head of element is :"+ queue.element());
        try {
            queue.add(44);
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too items to queue");
        }
        for (Integer value : queue) {
            System.out.println("Queue value:" + value);
        }

        System.out.println("Removed from queue" +queue.remove());
        System.out.println("Removed from queue" +queue.remove());
        System.out.println("Removed from queue" +queue.remove());
        try {
            System.out.println("Removed from queue" +queue.remove());
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Tried to remove too many items from queue");
        }


    }
}