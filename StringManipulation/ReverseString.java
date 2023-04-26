package StringManipulation;
public class ReverseString {
    public static void main(String[] args) {
    String word="pannap";
    String word1="";
    for (int i=word.length()-1; i>=0;i--){
        System.out.println(word.charAt(i));
        word1=word1+word.charAt(i);
    }
    System.out.println(word1); //check palindrome
    if (word.equals(word1)) System.out.println("palindrome");
    else System.out.println("not palindrome");
    }
}
