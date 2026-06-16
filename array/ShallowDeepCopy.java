//SHALLOW AND DEEP COPY
import java.util.Arrays;
public class ShallowDeepCopy {
    public static void main(String[] args) {
        int arr[]={22,34,56,67,76};
        int x[]=arr; // x IS SHALLOW COPY OF arr
        System.out.println(x[0]);
        int y[]=Arrays.copyOf(arr,arr.length);//DEEP COPY
        System.out.println(y[0]);

    }
    
}
