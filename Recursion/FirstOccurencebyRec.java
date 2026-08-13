public class FirstOccurencebyRec {
    public static  int FirstOccurence(int  arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr,key,i+1);
    }

    public static void main(String[] args) {
        int arr[]={3,4,2,5,4,5,6,4,3};
        System.out.println(FirstOccurence(arr,5,0));
    }
    
}
