package logicalProgOnNumbers;

import java.util.*;
public class SmallestEvenAfterRearrangingDigits {
    public static long getNextEven(String X) {
        int n = X.length();
        char[] arr = X.toCharArray();
        int i;
        for (i = n - 1; i > 0; i--) if (arr[i] > arr[i - 1]) break;
        if (i == 0) return -1;
        int x = arr[i - 1], smallest = i;
        for (int j = i + 1; j < n; j++) if (arr[j] > x && arr[j] < arr[smallest]) smallest = j;
        swap(arr, i - 1, smallest);
        Arrays.sort(arr, i, n);
        long res = Long.parseLong(new String(arr));
        return (res % 2 == 0) ? res : -1;
    }
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(getNextEven("34722641"));
    }
}
