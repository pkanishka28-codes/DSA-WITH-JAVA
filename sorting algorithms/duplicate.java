

public class duplicate {
    
    public static boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
                
            }
        
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums[]={2,4,3,2,6,7};
        System.out.println(containsDuplicate(nums));

    }
    
}
