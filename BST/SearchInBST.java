public class SearchInBST {
    public static boolean searchBST(Node root, int val){
        if(root == null )return false;
        if(root.data ==val)return true;

        else if(root.data<val){
            return searchBST(root.right, val);

        }else{
            return searchBST(root.left, val);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        int target = 3;
        System.out.println("Found " + target + "? " + searchBST(root, target));
    }

    
}
