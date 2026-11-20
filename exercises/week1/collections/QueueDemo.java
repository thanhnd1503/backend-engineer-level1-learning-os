package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> jobs = new ArrayDeque<>();

        jobs.offer("email-A");
        jobs.offer("email-B");
        jobs.offer("email-C");

        System.out.println(jobs);
        System.out.println("poll: " + jobs.poll());
        System.out.println("sau poll: " + jobs);
        System.out.println("peek: " + jobs.peek());
        System.out.println("sau peek: " + jobs);
        jobs.poll();
        jobs.poll();
        System.out.println("rong: " + jobs);
        System.out.println("poll khi rong: " + jobs.poll());

    }
}
