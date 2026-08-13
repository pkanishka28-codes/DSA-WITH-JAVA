public class LowerToUpperCase {
    public static String toLowerCase(String s) {
        char c[]=s.toCharArray();
        
        for(int i=0;i<c.length;i++){
            if(c[i] >=65 && c[i]<=90){
                c[i]=(char)(c[i]+32);
            }
        }
        return String.valueOf(c);
        
        
        
    }
    public static void main(String[] args) {
        String s="MurnAL";
        System.out.println(toLowerCase(s));
        
    }

    
}
