
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int arr[]={12,4,15,6,14,25,23};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
