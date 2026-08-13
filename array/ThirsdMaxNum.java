public class ThirsdMaxNum {
    public static void main(String[] args) {
        int arr[]={3,9,2};
        Integer i=null;
        Integer j=null;
        Integer k=null;

        for(Integer num:arr){
            if ((i != null && num.equals(i)) || (j != null && num.equals(j)) || (k != null && num.equals(k))) {
                continue;
            }
        
            if( i==null ||num >i){
                k = j;
                j = i;
                i = num;

            }
            else if( j==null || num>j){
                k=j;
                j=num;
                

            }
            else if( k==null || num >k){
                k=num;
            }
            
        }
        System.out.println(k == null ? i : k);

    }
    
}
