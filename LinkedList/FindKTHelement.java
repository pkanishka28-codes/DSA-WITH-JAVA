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

    Node findKthFromEnd(int k){
        Node f=head;
        Node s=head;

        for(int i=0; i<k; i++){
            if(f==null){
                return null;
            }
            f=f.next;
        }
        while(f!=null){
            s=s.next;
            f=f.next;
        }
        return s;
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

public class FindKTHelement {
public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        
        // Since it's addAtHead, adding 5 then 4 then 3 creates: 3 -> 4 -> 5
        list.addAtHead(5);
        list.addAtHead(4);
        list.addAtHead(3);
        list.display();
        
        int k = 2;
        Node result = list.findKthFromEnd(k);
        
        if (result != null) {
            System.out.println(k + "nd node from end is: " + result.val);
        } else {
            System.out.println("Out of bounds!");
        }
    }
    
}
