import java.util.*;

public class TwoDArrayPrinting {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        int arr[][]={{2,3,4},
                {5,6,7},
                {8,9,0}
        };
        System.out.println(arr[1][2]);

        for(int i=0;i<arr.length ;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println();

        int arr1[][]=new int[3][3];
        //INPUT IN 2 D ARRAY 
        for(int i=0;i<arr1.length ;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.println("ENTER VALUES " );
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<arr1.length ;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" | ");
            }
            System.out.println();
        }
        sc.close();
    }
    
    
}
