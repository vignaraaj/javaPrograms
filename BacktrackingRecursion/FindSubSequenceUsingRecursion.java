package BacktrackingRecursion;

import java.util.ArrayList;
import java.util.List;
public class FindSubSequenceUsingRecursion {
    //subsequence -> 2^n  including empty sequence
    //substring   -> n*(n+1)/2
    static List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        String s = "abc";
        findSubSequence(s,"");
        System.out.println(result);
        findSubString(s);
    }
    static void findSubSequence(String subSequence1 , String temp){
        if(subSequence1.length()==0){
            result.add(temp);
            return;
        }// We add adding 1st character in string
        findSubSequence(subSequence1.substring(1),temp+subSequence1.charAt(0));
        // Not adding first character of the string because the concept of subsequence either character will present or not
        findSubSequence(subSequence1.substring(1),temp);
    }
    static void findSubString(String str ){
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) System.out.print(str.charAt(k));
                System.out.println();
            }
        }
        System.out.println();

    }
}

