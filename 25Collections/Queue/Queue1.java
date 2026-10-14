package Queue;
import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        //methods of Queue interface

        queue.offer(4);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll()); 
        System.out.println(queue);
        System.out.println(queue.poll()); 
        queue.offer(4);
        System.out.println(queue.peek());
        queue.remove(3);

        System.out.println(queue);

 }
}
