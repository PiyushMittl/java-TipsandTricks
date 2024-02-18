package main.java.poc;

public class InOrderTraversal {



    
    public static void main(String[] args) {
    
        Node n=new Node(10);
        n.left=new Node(20);
        n.right=new Node(30);
        n.left.left=new Node(40);
        n.left.right=new Node(40);
        n.right.left=new Node(50);
        n.right.right=new Node(60);
        n.right.left.right=new Node(70);
        n.right.right.left=new Node(80);

        InOrderTraversal.inOrder(n);

    }

    public static int inOrder(Node n){

        if(n==null)
        return 0;

        inOrder(n.left);
        System.out.println(n.data);
        inOrder(n.right);
        
        return 0;
    }

}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}