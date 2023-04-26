package logicalProgOnNumbers;

public class FindExtraElementInArr {
    // Find the difference between the sum of elements in both arrays
    public static void findExtraElement(int[] arr1, int[] arr2) {
        int extra1 = 0;
        int extra2 = 0;
        for(int i=0; i<arr2.length; i++) extra1 += arr2[i]; // Find the sum of elements in the second array
        for(int i=0; i<arr1.length; i++) extra2 += arr1[i];
        int value = extra1 - extra2;
        int element = extra1>extra2 ? value : -value;
        int i;
        for( i=0;i<arr1.length;i++) if(arr1[i]==element) {
            System.out.println(element + " is the extra element in 1st array at index " + i);
            return;
        }
        for( i=0;i<arr2.length;i++) if(arr2[i]==element) {
            System.out.println(element + " is the extra element in 2nd array at index " + i);
            return;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 12, 5};
        int[] arr2 = {10, 5, 30, 20};
        findExtraElement(arr1, arr2); //
        int[] arr3 = {-1, 0, 3, 2};
        int[] arr4 = {3, 4, 0, -1, 2};
        findExtraElement(arr3, arr4); //

    }
}
