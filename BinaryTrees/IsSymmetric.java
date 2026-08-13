

public class IsSymmetric {
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

    public static boolean isSymmetric(Node root) {
        if(root == null){
            return true;
        }
        
        return isMirror(root.left, root.right);

        
    }
    public static boolean isMirror(Node t1, Node t2){
        if(t1== null && t2== null)return true;
        if(t1 == null || t2 == null)return false;
        if(t1.val != t2.val){
            return false;
        }
        boolean outerMatch = isMirror(t1.left , t2.left);
        boolean innerMatch = isMirror(t1.right , t2.right);

        return outerMatch && innerMatch;
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

        display(a);
        System.out.println();
        System.out.println(isSymmetric(a));
        
    }
 
    
}
