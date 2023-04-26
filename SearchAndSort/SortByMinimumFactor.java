package SearchAndSort;

import java.util.Arrays;
public class SortByMinimumFactor {
    public static void main(String[] args) {
        Integer[] arr = {10, 7, 3, 14, 21};
        Arrays.sort(arr, (a, b) -> minFactor(a) - minFactor(b));
        System.out.println(Arrays.toString(arr));
    }
    static int minFactor(int num) {
        for(int i=2; i<=Math.sqrt(num); i++) if(num%i==0) return i;
        return num;
    }

}