public class SumOfNumRec {


    public static int sumOfNum(int n){
        if(n==1){
            return 1;
        }
        int sum=sumOfNum(n-1);
        int Fsum=n+sum;
        return Fsum;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfNum(n));
    }
    
}
