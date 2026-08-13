
import java.util.Scanner;

public class InputAndOutputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        char[] ele={'p','r','i','m','e'};
        for(char element: ele){
            System.out.print(element +" ");
        }
        System.out.println();

        String s="nova";
        System.out.println(s);
        //CharAt() and length() function 

        System.out.println(s.charAt(2));
        System.out.println(s.length());
        
        //TAKING INPUT

        System.out.print("enter string :");
        String p=sc.nextLine();
        System.out.println(p);
        
        System.out.print("enter string :");
        String q=sc.next();
        System.out.println(q);
        sc.close();
    }
    
}
