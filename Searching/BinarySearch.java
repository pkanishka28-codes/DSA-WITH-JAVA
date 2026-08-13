public class BinarySearch {
    public static int BinarySearchProgram(int arr[],int n){
        int i=0;
        int j= arr.length-1;
        
        while(i<=j){
            int mid=i+(j-i)/2;
            if(n==arr[mid]){
                return mid;
            }
            if(n>arr[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }

        return -1;


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=4;
        int res= BinarySearchProgram(arr, target);
        if(res==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index "+ res);

        }
        
       
    }
    
}
