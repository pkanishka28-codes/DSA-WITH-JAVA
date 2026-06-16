//PASSING ELEMENTS TO ARRAY
public class PassingEleToMethods {
    public static void change(int x[]){
        x[2]=77;

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,55,666,7777};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        change(arr);
        System.out.println(arr[2]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
