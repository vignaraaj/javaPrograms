package StringManipulation;
import java.util.Arrays;
public class RemoveDuplicatesInArray {
    //no extra space
    //Time Complexity: O(n) Auxiliary Space: O(1)
    public static void main(String[] args) {
        int[] test1 = new int[]{1, 1, 2, 2, 3, 4, 5};
        int[] test2 = new int[]{1, 1, 1, 1, 1, 1, 1};
        int[] test3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] test4 = new int[]{1, 2, 1, 1, 1, 1, 1};
        removeDuplicates(test1);
        System.out.println();
        removeDuplicates(test2);
        System.out.println();
        removeDuplicates(test3);
        System.out.println();
        removeDuplicates(test4);
        System.out.println();
        }
    static void removeDuplicates(int[] a) {
        Arrays.sort(a); //sort the array
        int n = a.length;
        if (n == 0 || n == 1) print(a,n);
        int j = 0;
        // check if the ith element is not equal to the (i+1)th element, then add that element
        // at the jth index in the same array which indicates that te particular element will only be added once in the array
        for (int i = 0; i < n - 1; i++)  if (a[i] != a[i + 1]) a[j++] = a[i];
        a[j++] = a[n - 1];
        print(a,j);
    }
    static void print(int[] a,int j){ for(int i=0;i<j;i++) System.out.print(a[i]+" "); }
}
