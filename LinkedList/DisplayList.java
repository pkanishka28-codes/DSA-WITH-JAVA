

public class DisplayList {

    public static void display(Node head){
        // System.out.print(head.val+ " ");
        // System.out.print(head.next.val+ " ");
        // System.out.print(head.next.next.val+ " ");
        // System.out.print(head.next.next.next.val+ " ");
        // System.out.print(head.next.next.next.next.val+ " ");
        Node temp=head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp=temp.next;

        }
        System.out.println();

    }
    //DISPLAY BY Recursion
    public static void DisplayByRecursion(Node head){

        if(head==null){
            return;
        }
        System.out.print(head.val+" ");
        DisplayByRecursion(head.next);
    }

    public static void main(String[] args) {
        //10 20 30 40 50
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);

        //connect krenge (link karenge)

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);

        DisplayByRecursion(a);

        
        
        
        
    }

    
}
