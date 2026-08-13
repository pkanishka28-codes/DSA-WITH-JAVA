

public class GetLinkedList {

    // Method to fetch the value at a specific 0-based index
    public static int Get(Node head ,int idx){

        // Start a temporary pointer at the head of the list
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;// Move the pointer to the next node
        }
        return temp.val;
    }
    public static void main(String[] var0) {
      Node var1 = new Node(10);
      Node var2 = new Node(20);
      Node var3 = new Node(30);
      Node var4 = new Node(40);
      Node var5 = new Node(50);
      var1.next = var2;
      var2.next = var3;
      var3.next = var4;
      var4.next = var5;
      

      System.out.println(Get(var1,3));
   }
    
}
