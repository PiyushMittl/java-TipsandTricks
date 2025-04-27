import java.util.Comparator;
import java.util.PriorityQueue;

public class SumElement{
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,12,5,15,11};
        int k1=3;
        int k2=6;
        int n1=getKth(k1,arr);
        int n2=getKth(k2, arr);
        int sum=0;

        for(int i: arr){
            if(i>n1 && i<n2){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    static int getKth(int k, int[] arr){
        PriorityQueue<Integer> q=new PriorityQueue<>(new NumberComparator());       
        for(int i: arr){
            
                q.add(i);
            if(q.size()>k){
                System.out.println(q.peek());
                q.poll();
            }
        }
        System.out.println("min number="+q.peek());
        return Integer.parseInt(q.peek().toString());
    }
}

class NumberComparator implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
        return o2.compareTo(o1);
    }
}