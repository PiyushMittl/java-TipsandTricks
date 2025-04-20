import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {
    public static void main(String[] args) {
        int k=3;
        int arr[] = new int[] {7,10,4,3,20,15};
        Queue<Integer> q = new PriorityQueue<>(new MinHeapComparater());

        for(int element: arr){
            if(q.size()==0 || q.peek()>element){
                q.add(element);
            }
            if(q.size()>k){
                q.poll();
            }
        }
        System.out.println("kth largest element = "+q.peek());
    }
}

class MinHeapComparater implements Comparator <Integer>{
    public int compare(Integer a, Integer b){
        return b.compareTo(a);
    }
}
