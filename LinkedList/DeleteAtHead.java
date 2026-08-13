

class Linkedlist{
    Node head;
    Node tail;

    void addAtHead(int  val){
        Node t=new Node(val);
        if(head==null){
            head=tail=t;
        }
        else{
            t.next=head;
            head=t;
        }
    }

    void deleteAtHead(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=tail=null;

        }else{
            head=head.next;
        }

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


public class DeleteAtHead {
    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.addAtHead(20);
        ll.addAtHead(30);
        ll.display();
        ll.addAtHead(50);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        
        
    }
}
