public class MajorityElementArray{
    public static void main(String[] args) {
        int count=0;
        int candidate=0;

        int arr[] ={2,1,1,1,2,2};
        for(int num:arr){

            if(count==0){
                candidate= num;
            }
            if(num == candidate){
                count++;
            }else{
                count--;
            }
            

        }
        System.out.println(candidate);
        
    }
}