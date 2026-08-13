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

    void addAtHead(int val){
        Node t= new Node(val);
            if(head == null){
                tail=head=t;
            }else{
                t.next=head;
                head=t;
            }
    }

    void DeleteKthFromEnd(int k){
        if (head == null) return;
        Node f=head;
        Node s=head;

        for(int i=0; i<k; i++){
            if(f==null){
                return;
            }
            f=f.next;
        }
        if (f == null) {
            head = head.next;
            return;
        }
        while(f.next!=null){ //doing f.next in this bcz we will be stopping at k-1 place and then we will comnnect k-1 plce to k+1 place 
            s=s.next;
            f=f.next;
        }
        s.next=s.next.next;
    }

    void display(){
        if(head==null){
            return;
        }
        Node t=head;
        while(t!=null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        System.out.println();
    }

    
}


public class DeleteKthElementFromEnd {
public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        
        list.addAtHead(5); // List becomes: 5 -> null
        list.addAtHead(4); // List becomes: 4 -> 5 -> null
        list.addAtHead(3); // List becomes: 3 -> 4 -> 5 -> null
        
        System.out.print("Original list: ");
        list.display();
        
        int k = 2; // Deleting 4
        list.DeleteKthFromEnd(k);
        
        System.out.print("After deleting " + k + "nd from end: ");
        list.display();
    }
}
