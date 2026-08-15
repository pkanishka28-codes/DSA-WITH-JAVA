import java.util.*;
public class HashmapOperation {
    public static void main(String[] args) {
        HashMap <String , Integer> h1 = new HashMap<>();
        //INSERT
        h1.put("ravi",98);
        h1.put("niya",89);
        h1.put("nick",97);
        h1.put("max",98);
          
        System.out.println("Size is : "+h1.size());
        //Get
        System.out.println(h1.get("ravi"));
        //ContainsKey
        System.out.println(h1.containsKey(97));
        //Remove
        h1.remove("niya");

        System.out.println("Size is : "+h1.size());
        h1.clear();
        System.out.println("Is this empty : "+h1.isEmpty());
    }
    
}
