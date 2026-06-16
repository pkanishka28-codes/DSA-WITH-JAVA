//MULTIPLY ODD INDEXED ELEMENTS BY 2 AND ADD 10 TO EVEN INDEXED ELEMENTS

public class OddEvenProblem {
    public static void main(String[] args) {
        int arr[]={1,2,13,41,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]+=10;
                
            }
            else{
                arr[i]*=2;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         } 
    }
}
    

