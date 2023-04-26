package BacktrackingRecursion;

import java.util.*;
public class DistinctPermutationsOfString {
    public static void main(String[] args) {
        String str = "ABC";
        Set<String> set = new HashSet<>();
        generatePermutations(str.toCharArray(), 0, set);
        for (String s : set) System.out.print(s + " ");
    }
    private static void generatePermutations(char[] str, int index, Set<String> set) {
        if (index == str.length - 1) set.add(new String(str));
        else {
            for (int i = index; i < str.length; i++) {
//                if (i == index || str[i] != str[index]) // avoid duplicates
                {
                    swap(str, index, i);
                    generatePermutations(str, index + 1, set);
                    swap(str, index, i);
                }
            }
        }
    }
    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
