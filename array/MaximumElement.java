//MAXIMUM ELEMENT IN AN ARRAY

public class MaximumElement {
    public static void main(String[] args) {
        int arr[]={209,45,67,202,9};
        int max=Integer.MIN_VALUE;
        //int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println("Max element is "+max);
    }
    
}
