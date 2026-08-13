import java.util.Stack;

public class RemoveConsecutiveCharacter {
    
    public String removeConsecutiveDuplicates(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Only push if the stack is empty OR the current char is different from the top char
            if (st.isEmpty() || st.peek() != c) {
                st.push(c);
            }
        }

        // Build the final string from the stack contents
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }

        return result.toString();
    }
}
