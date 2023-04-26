package SearchAndSort;
public class QuickSort {
    //Quick Sort has best O(n log(n))average O(n log(n) worst O(n^2) time complexity and O(n) space complexity.
    //QuickSort is a sorting algorithm based on the Divide and Conquer algorithm (like merge sort)that picks an element as a pivot and
    // partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }// This function takes last element as pivot, places the pivot element at its correct position
    // in sorted array, and places all smaller to left of pivot and all greater elements to right of pivot.
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the pivot
        int i = (low - 1); // Index of smaller element and indicates the right position of pivot found so far
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {   // If current element is smaller than the pivot
                i++; // Increment index of smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    } // The main function that implements QuickSort arr[] --> Array to be sorted, low --> Starting index, high --> Ending index

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[p] is now at right place
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1); // Separately sort elements before partition and after partition
            quickSort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 6, 7, 5 };
        int N = arr.length;
        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < N; i++) System.out.print(arr[i] + " ");
    }
}
