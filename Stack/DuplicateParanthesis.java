import java.util.Stack;

public class DuplicateParanthesis {
    public static boolean isDuplicateOrInvalid(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                
                // Missing '(' for this ')' -> INVALID!
                if (s.isEmpty()) {
                    return true; 
                }
                
                s.pop(); // pop '('
                
                // Duplicate check
                if (count < 1) {
                    return true; 
                }
            } else {
                s.push(ch);
            }
        }
        
        // If stack is NOT empty here, we have unclosed '(' like "(a+(b)"
        if (!s.isEmpty()) {
            return true; // Catching unclosed brackets!
        }
        
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+(b)))";
        System.out.println(isDuplicateOrInvalid(str)); // Now prints TRUE!
    }
}