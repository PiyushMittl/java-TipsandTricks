import java.util.Stack;

public class NGE{
    public static void main(String[] args) {
        int[] arr =new int[] {7,10,4,3,20,15};
        Stack<Integer> s = new Stack<>();

        for(int val: arr){
            while(s.size()>0 && s.peek()<val){
                s.pop();
            }
            System.out.println(s.size()>0? s.peek():-1);
            s.push(val);
        }
    }
}