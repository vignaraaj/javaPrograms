package SearchAndSort;

import java.util.Arrays;

public class SortInSingleLoop {
//    Sorting in a single loop, though it seems to be better, is not an efficient approach.
//    Using a single loop only helps in shorter code
//    The time complexity of the sorting does not change in a single loop (in comparison to more than one loop sorting)
//    Single loop sorting shows that number of loops has little to do with time complexity of the algorithm.
    public static int[] sortArrays(int[] arr) {
        int length = arr.length;
        for (int j = 0; j < length - 1; j++) {
            // Checking the condition for two simultaneous elements of the array
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                // updating the value of j = -1 so after getting updated for j++ in the loop it becomes 0 and the loop begins from the start.
                j = -1;
            }
        }
        return arr;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 99, 9, 8, 7, 6, 0, 5, 4, 3 };
        System.out.println("Original array: " + Arrays.toString(arr));
        arr = sortArrays(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
