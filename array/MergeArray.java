//MERGE TWO ARRAYS AND THEN SORT ITS ELEMENT
import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int nums1[]={2,9,4};
        int nums2[]={5,6};
        //FINDING SIZE OF MERGED ARRAY
        int TotalLen = nums1.length + nums2.length;
    
        //INITIALIZING MERGED ARRAY
        int[] arr = new int[TotalLen];
    
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[nums1.length + j]=nums2[j];
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted array :");
        System.out.println(Arrays.toString(arr));


    }
    
    
}

    
