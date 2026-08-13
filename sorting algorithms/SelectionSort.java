public class SelectionSort {
    public static void Selection_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_pos] > arr[j]){
                    min_pos=j;
                }
            }
            //swap
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,1};
        Selection_sort(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }


    
}
