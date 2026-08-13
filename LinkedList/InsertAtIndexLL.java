class Node{
    int val;
    Node next;

    //constructor node
    Node(int val){
        this.val=val;
    }

}
class Linkedlist{
    Node head;
    Node tail;
    int size = 0;

    void addAtHead(int  val){
        Node t=new Node(val);
        if(head==null){
            head=tail=t;
        }
        else{
            t.next=head;
            head=t;
        }
        size++;
    }

    void addAtTail(int val){
        Node t=new Node(val);

        if(tail==null){
            head=tail=t;

        }
        else{
            tail.next=t;
            tail=t;
        }
        size++;
    }




    void display(){
        if(head==null){
            return;
        }
        Node t=head;
        while(t!=null){
            System.out.print(t.val+"|");
            t=t.next;        
        }
        System.out.println();

    }
    int getSize() {
        return size;
    }
    void insert(int idx,int val){
        if(idx<0 || idx>size){
            System.out.println("INVALID SYNTAX");
            return;
        }
        if(idx==0){
            addAtHead(val);
        }   

        else if(idx==size){
            addAtTail(val);
        } 

        else{
            Node temp= head;
            for(int i=1; i<idx; i++){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;


        }
    }
}

public class InsertAtIndexLL {
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.addAtTail(60);
        ll.addAtHead(20);
        ll.addAtHead(30);
        System.out.println(ll.getSize());
        ll.display();
        ll.insert(3,45);
        System.out.println(ll.getSize());
        ll.display();
        
    }
    
}
