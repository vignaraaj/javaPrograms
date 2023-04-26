package StringManipulation;
public class Alphachar {
    public static void main(String[] args) {
        String word="Vkj 0510";
        //to print numbers
        for (int i=0;i<word.length();i++){
            if(word.charAt(i)>='0'&& word.charAt(i)<='9')
                    System.out.print(word.charAt(i));
        }
        System.out.print(" ");
        //to print numbers using regex
        System.out.println(word.replaceAll("[a-zA-Z\\s]",""));
        //to print char
        for (int i=0;i<word.length();i++){
            if(word.charAt(i)>='a' && word.charAt(i) <= 'z') {
                    System.out.print(word.charAt(i));
            }
            else if(word.charAt(i)>='A'&& word.charAt(i) <= 'Z') {
                        System.out.print(word.charAt(i));
                }
        }
        //to print char using regex(replaceAll)
        System.out.println(word.replaceAll("[0-9\\s]",""));

        //to check whether the string has only numbers
        try{
            int no=Integer.parseInt(word);
            /* parseint is a method in Integer class which converts the string
             arguments into integer provided the strings should be numbers */
            System.out.println(no);
            System.out.println("only numbers");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("contains alphabets too ");
        }

        //string count for only numbers
        int count=0;
        for (int i=0;i<word.length();i++) {
            if (word.charAt(i) >= '0'&& word.charAt(i) <= '9')
                count++;
        }
            System.out.println(count);
    }
}
/*
charAt() is same like index() in java.
regex can also be used
-->repalceAll
[\\s] is used to mention blank space
[a-zA-z] is the notation to mention alphabets
*/
