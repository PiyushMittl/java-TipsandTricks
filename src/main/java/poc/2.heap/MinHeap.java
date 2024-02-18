import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> q= new PriorityQueue<>();
        q.add(10);
        q.add(30);
        q.add(2);

        while(q.size()>0){
            System.out.println("peek= "+q.peek());
            System.out.println("poll= "+q.poll());
        }

        /*
         * output:
            peek= 2
            poll= 2
            peek= 10
            poll= 10
            peek= 30
            poll= 30
         */
    }
}