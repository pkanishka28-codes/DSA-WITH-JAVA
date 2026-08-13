import java.util.*;
class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val = val;
    }
}
public class LeftAndRightViewOfTree {
    
    public static List<Integer> rightSideView (Node root){
        List<Integer> ans = new ArrayList<>();
        getrightView(root,0,ans);
        return ans;
    }
    private static void getrightView(Node root, int level, List<Integer> ans) {
        if(root == null)return;
        if(level==ans.size()) {
            ans.add(root.val);
        }
        
        getrightView(root.right,level+1,ans);
        getrightView(root.left ,level+1,ans);

    }

    public static List<Integer> leftSideView(Node root){
        List<Integer> ans =new ArrayList<>();
        getleftView(root,0,ans);
        return ans;
    }
    private static void getleftView(Node root, int level, List<Integer> ans) {
        if(root == null)return;
        if(level == ans.size()){
            ans.add(root.val);
        }
        
        getleftView (root.left ,level+1 ,ans);
        getleftView (root.right ,level+1 , ans);

    }
    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
               \     \
                5     4
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(4);

        System.out.println("Left View:  " + leftSideView(root));   // Output: [1, 2, 5]
        System.out.println("Right View: " + rightSideView(root));  // Output: [1, 3, 4]
    }
    
}
