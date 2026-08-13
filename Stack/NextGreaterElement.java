import java.util.*;
public class NextGreaterElement {
    public static void NGE(int arr[]){
        
        Stack <Integer> s = new Stack<>();
        int n=arr.length;
        int nextGreater[] = new int[n];
        for(int i=n-1 ; i>=0 ; i--){
            if(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        NGE(arr);
        
    }
    
}
