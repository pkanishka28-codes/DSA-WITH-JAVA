public class InsertionSort {
    public static void insertion_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j] >curr ){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,1};
        insertion_sort(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
    
}
