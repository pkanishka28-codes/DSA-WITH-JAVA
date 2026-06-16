//MINIMUM ELEMENT IN ARRAY
public class MinimumElement{
    public static void main(String[] args) {
        int arr[]={22,5,6,23,67,1};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];

            }
        }
        System.out.println("minimum element in array is "+min);
    }
    
}
