/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */

import java.util.Arrays;

public class MedianSortedArrays {
    public static void main(String[] args) {
        double median;
        int nums1[]={2,3,4};
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
        Arrays.sort(arr);

        //MEDIAN FIND
        if(TotalLen%2 !=0){
            // Odd: Grab the single middle element
            median=arr[TotalLen/2];

        }
        else{
            // Even: Average the two middle elements
            median=(arr[(TotalLen / 2) - 1] + arr[TotalLen / 2]) / 2.0;

        }
        System.out.println("MEDIAN IS "+median);
        

    }
    
    
}
