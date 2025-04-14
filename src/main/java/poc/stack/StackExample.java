package poc.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
     
        Stack<Integer> stack=new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println("stack size="+stack.size());
        System.out.println("Peek="+stack.peek());
        System.out.println("stack size after Peek="+stack.size());
        
        System.out.println("Peek="+stack.pop());
        System.out.println("stack size after Pop="+stack.size());        
    }
}
