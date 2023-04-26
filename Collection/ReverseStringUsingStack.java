import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String s = "vkj";
        char[] c = s.toCharArray();
        int n = s.length();
        Stack stack = new Stack();
        int i=0;
        while(i<n){
            stack.push(c[i]);
            i++;
        }
        System.out.println(stack);
        char[] reverseChar = new char[n];
        int j =0;
        while(true){
            if(stack.isEmpty()) break;
            reverseChar[j]= (char) stack.pop();
            j++;
        }
        System.out.println(reverseChar);
    }
}
