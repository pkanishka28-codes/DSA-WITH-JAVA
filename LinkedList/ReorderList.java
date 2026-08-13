import java .util.*;

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

    void reorderList(){
        if(head==null || head.next==null){
            return;
        }
        // BREAK IN 2
        Node s = head;
        Node f=head.next;

        while(f != null && f.next != null){
            s=s.next;
            f=f.next.next;

        }

        //REVERSE SECOND HALF
        Node sec = s.next;
        s.next = null;
        Node p= null;

        while(sec != null){
            Node temp = s.next;
            s.next = p;
            p=s;
            s=temp;

        }



    }
}


public class ReorderList {
    
}
