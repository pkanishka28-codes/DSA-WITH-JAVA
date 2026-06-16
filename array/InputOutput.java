//INPUT AND OUTPUUT OF AN ARRAY

import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

    
        }
        System.out.println("Array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    

    
}
