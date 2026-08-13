

public class PathSum {
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

    public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        int rem =targetSum - root.val;
        return hasPathSum(root.left,rem) || hasPathSum(root.right,rem);
        
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        display(a);
        System.out.println();
        System.out.println(hasPathSum(a,5));
        
    }

  
    
}
