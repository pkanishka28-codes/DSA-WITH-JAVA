import java.util.*;
public class ParanthesisChecked {
    static boolean isBalance(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch =='['){
                st.push(ch);
            }
            else{
                if(st.size() == 0){
                    return false;
                }
                char top = st.peek();
                if(sameStyle(top,ch)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return(st.size() == 0);
        
        

    }
    static boolean sameStyle(char a, char b){
        if(a == '(' && b == ')'){
            return true;
        }
    
        if(a == '{' && b == '}'){
            return true;
        }       
        if(a == '[' && b == ']'){
            return true;
        }       
        return false;
    }
    
public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "{{[[(( ))]]}}";

        System.out.println("Is \"" + test1 + "\" balanced? " + isBalance(test1)); // Expected: true
        System.out.println("Is \"" + test2 + "\" balanced? " + isBalance(test2)); // Expected: false
        System.out.println("Is \"" + test3 + "\" balanced? " + isBalance(test3)); // Expected: true
    }
}
