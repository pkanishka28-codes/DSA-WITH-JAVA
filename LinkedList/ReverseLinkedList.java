import java.util.*;
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

    //METHOD1
    // Node ReverseLinkedlist(Node head){
    //     Node temp=head;
    //     ArrayList<Node> arr = new ArrayList<>();
    //     while(temp!=null){
    //         arr.add(temp);
    //         temp=temp.next;
    //     }
    //     int n=arr.size();
    //     for(int i=n-1; i> 0; i--){
    //         Node t1= arr.get(i);
    //         Node t2= arr.get(i-1);
    //         t1.next=t2;
    //     }
    //     arr.get(0).next = null;

    //     return arr.get(n-1);
    // }


    //METHOD 2
    // Node ReverseLinkedlist(Node head){
    //     Node p=null;
    //     Node c=head;
    //     Node f=null;

    //     while(c != null){
    //         f=c.next;
    //         c.next=p;
    //         p=c;
    //         c=f;

    //     }
    //     return p;
    // }

    //METHOD 3 (RECURSIVE)
    Node ReverseLinkedlist(Node head){
        if(head.next == null || head == null){
            return head;
        }
        Node a = head.next;
        head.next=null;

        Node b=ReverseLinkedlist(a);
        a.next = head;
        return b;


    }


    void display(Node t){
        
        while(t != null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        System.out.println();
        
    }
}



public class ReverseLinkedList {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);


        System.out.print("Before: ");
        list.display(list.head);

        list.head = list.ReverseLinkedlist(list.head);

        System.out.print("After:  ");
        list.display(list.head);
    }
}