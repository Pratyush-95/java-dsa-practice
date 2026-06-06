import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.offer(10); // use to add the value in Queue
        q.offer(20);
        q.offer(30);
        System.out.println(q);

        q.peek() ; // use to return the Head(First position) of element in Queue
        System.out.println(q.peek()); // use to return the Head(First position) of element in Queue

        System.out.println(q.poll()); // return and remove the head of the value in queue
    }
}
