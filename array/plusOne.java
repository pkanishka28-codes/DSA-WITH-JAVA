class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
        
            
            // If it was a 9, it becomes 0, and the loop moves left
            digits[i] = 0;
        
            
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
        
        
}
public class plusOne{
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int 
    }
}