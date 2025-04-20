import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortKSorted {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(new IntegerComparator());
        int arr[] = new int[] { 6, 5, 3, 2, 8, 10, 9 };
        int k = 3;

        for (int e : arr) {
            q.add(e);
            if (q.size() > 3) {
                System.out.println(q.poll());
            }
        }
        while (q.size() > 0) {
            System.out.println(q.poll());
        }
    }
}

class IntegerComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return a.compareTo(b);
    }
}