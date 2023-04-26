package logicalProgOnNumbers;

import java.util.Arrays;
public class FindLeastPrimeDivisible {
    public static void main(String[] args) {
        int[] arr1 = {20, 7};
        int[] arr2 = {11, 5};
        int[] result = findLeastPrimes(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findLeastPrimes(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int num = arr2[i];
            int prime = -1;
            for (int j = 1; j <= 1000; j++) {
                if (isPrime(j)) {
                    if ((arr1[i] + j) % num == 0) {
                        prime = j;
                        break;
                    }
                }
            }result[i] = prime;
        }
        return result;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }
}
