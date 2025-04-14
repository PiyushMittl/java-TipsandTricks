import java.util.*;

public class test{
    public static void main(String a[]){
        // Map<String,String> m = new HashMap<>();
        // m.put("name","Piyush");
        // m.put("age","21");
        // m.put("add","India");

        // for(Entry<String, String> e:m.entrySet()){
        //     System.out.println("key="+e.getKey());
        //     System.out.println("value="+e.getValue());
        
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
    
    }
}
