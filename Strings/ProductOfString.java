public class ProductOfString {
    // A simple helper method you can call in your loop
    public static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;
    }
    public static void main(String[] args) {
        String s="leetcode";
        char[] arr=s.toCharArray();

        int i=0;
        int j=arr.length-1;
        while(i<j){
            if( !isVowel(arr[i])){
                i++;
                continue;
            }
            if(!isVowel(arr[j])){

                j--;
                continue;
            }
            // 3. If both i and j are on vowels, swap them!
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            // 4. Move both pointers inward after the swap
            i++;
            j--;
        }
        
        // Turn the char array back into a nice String
        String result = new String(arr);
        System.out.println(result); // Should output "leotcede"

        }
    }
    




