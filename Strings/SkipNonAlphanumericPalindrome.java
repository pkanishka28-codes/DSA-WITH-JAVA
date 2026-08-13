public class SkipNonAlphanumericPalindrome {
    
    public static void main(String[] args) {
        
        boolean isPalindrome = true;
        String d = "A man, a plan, a canal: Panama";
        String a= d.toLowerCase();

        int i=0;
        int j=a.length()-1;
        while (i < j ){
            // Mini-loop to skip non-alphanumeric from left
            while (i < j && !Character.isLetterOrDigit(a.charAt(i))) {
                i++;
            }
            // Mini-loop to skip non-alphanumeric from right
            while (i < j && !Character.isLetterOrDigit(a.charAt(j))) {
                j--;
            }
            if(a.charAt(i) != a.charAt(j)){
                isPalindrome=false;
                break;
            }
            i++;
            j--;
            
        }
        if(isPalindrome){
            System.out.println("STRING  IS PALINDROME");
        }
        else{
            System.out.println("STRING  IS NOT PALINDROME");
        }

        
    
    }
}
