
public class PreOrderTraversal {
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

        preOrder(n);

    }

    static int preOrder(Node n){

        if(n==null)
        return 0;
        
        System.out.println(n.data);
        preOrder(n.left);
        preOrder(n.right);

        return 0;

    }

}
