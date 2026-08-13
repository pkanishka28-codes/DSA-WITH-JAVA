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
    int size=0;

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

    Node middle(){
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;

    }
    void delete(){
        
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

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.addAtTail(60);
        
        System.out.print("List: ");
        ll.display(); 

        Node mid = ll.middle();
        System.out.println("Middle element value: " + mid.val); 
    }
    
    
}
