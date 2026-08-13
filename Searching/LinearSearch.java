public class LinearSearch {
    public static int linearSearch(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={2,3,5,6,8};
        int n=10;
        System.out.println(linearSearch(arr,n));
        
    }
    
}
