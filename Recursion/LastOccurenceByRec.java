public class LastOccurenceByRec {
    public static  int LastOccurence(int  arr[],int key, int i){
        if(i==arr[0]){
            return -1;
        }
        int n=arr.length;
        if(arr[n]==key){
            return i;
        }
        return LastOccurence(arr,key,n-1);
    }

    public static void main(String[] args) {
        int arr[]={3,4,2,5,4,5,6,4,3};
        System.out.println(LastOccurence(arr,5,0));
    }
    
}
