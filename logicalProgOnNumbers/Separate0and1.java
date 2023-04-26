package logicalProgOnNumbers;

public class Separate0and1 {
    public static void separateZeroesOnes(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] == 0 && left < right)
                left++;
            while (arr[right] == 1 && left < right)
                right--;
            if (left < right) {
                arr[left++] = 0;
                arr[right--] = 1;
            }
        }
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
    }

    public static void main(String[] args) {
        separateZeroesOnes(new int[]{ 0,1,1,1,0,0,1,1,0,1});
    }
}
