//PRINTING NEGATIVE ELEMENTS OF AN ARRAY
import java.util.Scanner;

public class NegativeElementOnly {
    
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("NEGATIVE ELEMENTS OF ARRAY ARE ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}

    

