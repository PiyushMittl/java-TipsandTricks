import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeap {


    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>(new MinHeapComparater());
        q.add(10);
        q.add(3);
        q.add(20);
        q.add(1);
        q.add(34);

        while(q.size()>0){
            System.out.println("peek= "+q.peek());
            System.out.println("poll= "+q.poll());
        }

    }
}
class MinHeapComparater implements Comparator <Integer>{
    public int compare(Integer a, Integer b){
        return b.compareTo(a);
    }
}
