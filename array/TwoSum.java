//TWO SUM

public class TwoSum{
    public static boolean twoSUM(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;i<arr.length;i++){
                if(arr[i]+arr[j]==target){
                    return true;

                }
            }

        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={5,6,3,1,2};
        int target=8;
        twoSUM(arr,target);

    }
}    

 
