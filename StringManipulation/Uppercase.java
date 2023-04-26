package StringManipulation;

public class Uppercase {
    public static void main(String[] args) {
        String word="vignaraaj";
        char[] ch=word.toCharArray();
        //tocharArray converts the string into a character array

        ch[0]=(char)(ch[0]-32);//makes the first letter to uppercase
        //-32 makes lower to upper, +32 makes upper to lower
        Character.toUpperCase(ch[0]);
        word=new String(ch);  //char array to string
        System.out.println(word);
        for (int i=0;i<ch.length;i++) System.out.print(ch[i]);
        System.out.println();
        //substring is same like slice() in python
        String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
        //substring(0,1)---->  prints only first char
        //substring(1)----->   prints every char from 1st index till last
        //to swap cases alternatively
        for (int i=0;i<s.length();i++){
            if(i%2==0) System.out.print(s.substring(i,i+1).toUpperCase());
            else System.out.print(s.substring(i,i+1).toLowerCase());
        }
    }
}
