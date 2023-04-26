package SearchAndSort;

public class LexicographicSort {
    public static void lexicographicSort(String[] arr) {
        int n = arr.length;
        // Perform selection sort
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) if (compareStrings(arr[j], arr[minIdx]) < 0) minIdx = j;
            String temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        for(String a : arr) System.out.print(a+" ");
    }

    public static int compareStrings(String s1, String s2) {
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) < s2.charAt(i)) return -1;
            else if (s1.charAt(i) > s2.charAt(i)) return 1;
            i++;
        }
        // If one string is a prefix of the other, the shorter string comes first
        if (i < s1.length()) return 1;
        else if (i < s2.length()) return -1;
        return 0;
    }

    public static void main(String[] args) {
        lexicographicSort(new String[] { "vignu","ck"});
    }
}
