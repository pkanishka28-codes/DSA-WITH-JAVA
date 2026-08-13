public class ReverseString {
    public static void main(String[] args) {
        int i=0;
        char s[]={'a' , 'b' ,'c' , 'd'};
        int j=s.length-1;

        while(i<=j){
            char a=s[i];
            s[i]=s[j];
            s[j]=a;
            i++;
            j--;
        }
        for(int p=0; p<s.length; p++){
            System.out.print(s[p] +"|");
        }
        
        
            
        
    }
    
}
