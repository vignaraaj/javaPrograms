package logicalProgOnNumbers;

import java.util.Arrays;
import java.util.Comparator;

public class PrintLargestPossibleNumberFromArray {
        public static String printLargest(int[] arr) {
            String[] strArr = new String[arr.length];// Convert the integer array to a string array
            for (int i = 0; i < arr.length; i++) strArr[i] = Integer.toString(arr[i]);
            Comparator<String> comp = (str1, str2) -> {//does custom sorting
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);//does natural ordering lexicographical sorting and returns the largest number.
            };
            Arrays.sort(strArr, comp);// Sort the string array using the custom comparator
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) sb.append(str);// Concatenate the string array to form the largest number
            return sb.toString();
        }

    public static void main(String[] args) {
        System.out.println(printLargest(new int[]{54, 546, 548, 60}));
    }
}
