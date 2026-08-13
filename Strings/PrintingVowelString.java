import java.util.Scanner;

public class PrintingVowelString {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int count=0;

        System.out.print("Enter a string: ");
        String ele= sc.nextLine();
        System.out.println("element is "+ele);

        for(char i=0;i<ele.length();i++){
            char ch = ele.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }

        }
        System.out.println(count);
        sc.close();



    }
    
}
