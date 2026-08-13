public class MaxInLinearSearch {
    public static int MaxInlinearSearch(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
                 
        }
        return max;
        
        
    }
    
    public static void main(String[] args) {
        int arr[]={2,10,5,9,8};
        System.out.println(MaxInlinearSearch(arr));

        
        
    }
    
    
}
