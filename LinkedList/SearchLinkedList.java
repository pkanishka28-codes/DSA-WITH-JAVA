

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

    

    int search(int val){
        if(head==null){
            return -1;
        }
        Node t=head;
        int idx=0;
        while(t!=null){
            if(t.val==val){
                return idx;
            }
            t=t.next;
            idx++;
        }
        return -1;


    }
}

public class SearchLinkedList {
    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.addAtHead(20);
        ll.addAtHead(30);
        ll.search(20);
        ll.addAtHead(50);
        ll.display();
        System.out.println("30 is present at index "+ll.search(30));
        System.out.println("20 is present at index "+ll.search(20));
        
    }
    
}
