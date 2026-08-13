public class FibonacchiByRecursion {

    public static int fibonacchi(int n){
        
        if(n==0 || n==1){
            return n;    
        }
        int f1= fibonacchi(n-1);
        int f2= fibonacchi(n-2);
        
        return f1 + f2;
    }


    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacchi(n));
    }
    
}
