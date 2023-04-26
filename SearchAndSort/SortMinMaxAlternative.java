package SearchAndSort;

import java.util.Arrays;
public class SortMinMaxAlternative {
    public static void sortAlternately(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println(); // sort the array in descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 1; i < n - 1; i += 2) {// swap elements alternatively
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        sortAlternately(new int[]{1,2,3,4,5,6,7});
    }
}
