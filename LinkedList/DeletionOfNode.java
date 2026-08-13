class Node {
    int val;
    Node next;

    // constructor node
    Node(int val) {
        this.val = val;
    }
}

class Linkedlist {
    Node head;
    Node tail;
    int size = 0;
    
    void addAtHead(int val) {
        Node t = new Node(val);
        if (head == null) {
            head = tail = t;
        } else {
            t.next = head;
            head = t;
        }
        size++;
    }

    void addAtTail(int val) {
        Node t = new Node(val);
        if (tail == null) {
            head = tail = t;
        } else {
            tail.next = t;
            tail = t;
        }
        size++;
    }
    
    void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    void display() {
        if (head == null) {
            return;
        }
        Node t = head;
        while (t != null) {
            System.out.print(t.val + "|");
            t = t.next;
        }
        System.out.println();
    }
}
   
    
public class DeletionOfNode {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.addAtTail(60);
        ll.addAtHead(20);
        ll.addAtHead(30);
        
        System.out.println("Before deletion:");
        ll.display(); 

        // Grabbing the node '20' (which is right after head) to test
        Node target = ll.head.next; 
        ll.deleteNode(target);

        System.out.println("After deleting node:");
        ll.display(); 
    }
    
}
