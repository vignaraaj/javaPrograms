package logicalProgOnNumbers;

import java.util.HashSet;
import java.util.Set;
public class FindMissingNumberIn2ndArray {
    public static void findMissingNumbers(int[] a, int[] b) {
        StringBuilder result = new StringBuilder();
        Set<Integer> setB = new HashSet<>();// create a hash set to store the numbers in B
        for (int num : b) setB.add(num);
        for (int num : a) if (!setB.contains(num)) result.append(num).append(" ");// iterate numbers is A and check if they are in B
        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 10};
        int B[] = {2, 3, 1, 0, 5};
        findMissingNumbers(A,B);
    }
}
