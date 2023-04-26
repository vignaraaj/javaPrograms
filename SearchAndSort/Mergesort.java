package SearchAndSort;

public class Mergesort{
    //divide and conquer technique...
    //time complexity is o(nlog(n)) for average ,worst and best case, o(n) space complexity
    void merge(int arr[], int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;
        int leftArray[] = new int[leftSize];
        int rightArray[] = new int[rightSize];
        //store the element value in new array.
        for (int i = 0; i < leftSize; ++i) leftArray[i] = arr[left + i];
        for (int j = 0; j < rightSize; ++j) rightArray[j] = arr[middle + 1 + j];
        int i = 0, j = 0;
        int k = left;
        //working of merge sort after dividing through recursion...
        //       left                         right
        //       27,38                        3,43
        //     check 27 and 3, which is smaller,
        //     so in merged new array place 3 first.
        //     then after 3 is placed the index moves to next element in array which has 3
        //     so left array's 27 is now compared with 43
        //     27 is smaller so place 27 after 3
        //     now after 27 is placed the number 43 is compared with next element in array which has 27 here i.e 38
        //     38 is smaller than 43 so place 3,27,38 atlast 43 is placed
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }k++;
        }
        //to deal with left out elements
        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given array : ");
        printArray(arr);
        Mergesort ob = new Mergesort();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}