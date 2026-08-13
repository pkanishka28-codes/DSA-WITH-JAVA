class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }

}
class Linkedlist{
    Node head;
    Node tail;
    
    void addAtHead(int val) {
        Node t = new Node(val);
        if (head == null) {
            tail = head = t;
        } else {
            t.next = head;
            head = t;
        }
    }

    void  SwapNode(int k){
        Node f=head;
        Node s=head;

        for(int i=1;i<=k;i++){
            f=f.next;
        }
        while(f != null){
            s=s.next;
            f=f.next;
        }

        f=head;

        for(int i=1;i<=k-1;i++){
            f = f.next;
        }
        int temp=f.val;
        f.val=s.val;
        s.val=temp;
        
    }
    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.val + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }
}



public class SwappingNodesInLinkedList {
public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        
        // Creating the list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        list.addAtHead(5);
        list.addAtHead(4);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(1);
        
        System.out.print("Original List: ");
        list.display();
        
        int k = 2; 
        list.SwapNode(k);
        
        System.out.print("After Swapping " + k + "nd nodes: ");
        list.display();
    }
}
