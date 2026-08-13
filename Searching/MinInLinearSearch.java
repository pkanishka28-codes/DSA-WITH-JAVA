public class MinInLinearSearch{

    public static int MinInlinearSearch(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
           
                 
        }
        return min;
        
        
    }
    
    public static void main(String[] args) {
        int arr[]={2,10,0,9,8};
        System.out.println(MinInlinearSearch(arr));

        
        
    }
    

}