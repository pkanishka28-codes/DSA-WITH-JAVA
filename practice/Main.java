import java .util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter start: ");
        int start=sc.nextInt();
        System.out.print("enter end: ");
        int end=sc.nextInt();
        
        boolean isAsc= start<end;
        if(isAsc){
            while(start<=end){
                System.out.println(start);
                start++;
            }
        }
        else{
            while(start>=end){
                System.out.println(start);
                start--;
            }
        }
        sc.close();

          


        
    }

}
            