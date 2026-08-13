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

    Node sortedMerge(Node head1 , Node head2){
        Node i=head1;
        Node j=head2;
        Node dummy=new Node(-1);
        Node k=dummy;
        while(i != null && j != null){
            if(i.val <= j.val){
                k.next=i;
                i=i.next;
            }  
            else{
                k.next=j;
                j=j.next; 
            }
            k=k.next;              
        }
        if(i == null){
            k.next=j;

        }else{
            k.next=i;
        }

        return  dummy.next;


    }

    void display(){
        Node t=head;
        while(t != null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        
    }
}


public class MergeTwoSortedList {
    public static void main(String[] args) {
        Linkedlist list1 = new Linkedlist();
        list1.head = new Node(1);
        list1.head.next = new Node(3);
        list1.head.next.next = new Node(5);

        Linkedlist list2 = new Linkedlist();
        list2.head = new Node(2);
        list2.head.next = new Node(4);
        list2.head.next.next = new Node(6);

        System.out.print("List 1: ");
        list1.display();
        System.out.println();

        System.out.print("List 2: ");
        list2.display();
        System.out.println();

        Linkedlist resultList = new Linkedlist();
        resultList.head = resultList.sortedMerge(list1.head, list2.head);

        System.out.print("Merged List: ");
        resultList.display();
    }
}
