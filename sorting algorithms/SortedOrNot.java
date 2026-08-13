public class SortedOrNot {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7,7};
        int flag=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                flag=0;
                break;
            }
            else{
                flag=1;
            }

        }
        if(flag==1){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    
    }
}
