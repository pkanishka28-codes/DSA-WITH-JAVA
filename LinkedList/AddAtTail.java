
class Linkedlist{
    Node head;
    Node tail;

    void addAtTail(int val){
        Node t=new Node(val);

        if(tail==null){
            head=tail=t;

        }
        else{
            tail.next=t;
            tail=t;
        }
    }

    void display(){
        if(tail==null){
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


public class AddAtTail {

    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.addAtTail(2);
        ll.addAtTail(3);
        ll.addAtTail(4);
        ll.display();


    }
    
}
