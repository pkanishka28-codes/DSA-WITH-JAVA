

public class SameTree {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }


    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    
    public static boolean isSame(Node p, Node q){
        if(p== null && q== null)return true;
        if(p == null || q == null)return false;
        if(p.val != q.val){
            return false;
        }
        boolean leftMatch = isSame(p.left , q.left);
        boolean rightMatch = isSame(p.right , q.right);

        return leftMatch && rightMatch;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(4);
        Node d = new Node(2);
        Node e = new Node(1);
        Node f = new Node(2);
        Node g = new Node(1);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        Node h = new Node(3);
        Node i = new Node(4);
        Node j = new Node(4);
        Node k = new Node(2);
        Node l = new Node(1);
        Node m = new Node(2);
        Node n = new Node(1);
        h.left=i; h.right=j;
        i.left=k; i.right=l;
        j.left=m; j.right=n;

        display(a);

        System.out.println();
        display(h);
        System.out.println();
        System.out.println(isSame(a,h));
        
    }
 
    
}
