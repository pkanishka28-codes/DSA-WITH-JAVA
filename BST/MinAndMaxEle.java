
class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class MinAndMaxEle {
    public static int minValue(Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    public static int maxValue(Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        System.out.println("Min: " + minValue(root));
        System.out.println("Max: " + maxValue(root));
    }
}