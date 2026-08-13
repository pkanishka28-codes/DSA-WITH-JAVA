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

    Node deleteMiddle(Node head){
        if(head==null || head.next==null){
            return null;
        }

        Node s=head;
        Node f=head;
        Node p=null;
        while(f!=null && f.next!=null){
            p=s;
            s=s.next;
            f=f.next.next;
            
        }

        p.next=p.next.next;


        return head;
        

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


public class DeleteMiddleNode {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        
        System.out.print("Before: ");
        ll.display(); // 10|20|30|40|50|

        ll.deleteMiddle(ll.head);

        System.out.print("After:  ");
        ll.display(); // 10|20|40|50| (30 is gone!)
    }
    
}
