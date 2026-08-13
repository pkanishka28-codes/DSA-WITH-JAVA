import java .util.*;

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

    static boolean isPalindrome(Node head){
        Node temp=head;
        ArrayList<Integer>arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.val);
            temp= temp.next;
        }
        int n=arr.size();
        int i=0; 
        int j=n-1;
        while(i<=j){
            if(!arr.get(i).equals(arr.get(j))){
                return  false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;

    }

    void display(Node t){
        
        while(t != null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        
    }
}




public class PalinndromelinkedList {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        
        // Creating a palindrome list: 10 -> 20 -> 20 -> 10
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(10);

        System.out.print("List: ");
        list.display(list.head);

        boolean result = Linkedlist.isPalindrome(list.head);
        System.out.println("Is palindrome? " + result);
    }
}
