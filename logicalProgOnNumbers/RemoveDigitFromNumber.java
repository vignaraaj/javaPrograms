package logicalProgOnNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDigitFromNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print ("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter digit: ");
        int digit = sc.nextInt();
        try {
            while (digit != 0) {
                for (int i = 0; i < n; i++) {
                    String str = Integer.toString(arr[i]);
                    str = str.replaceAll(Integer.toString(digit), "");
                    arr[i] = Integer.parseInt(str);
                }
                System.out.println(Arrays.toString(arr));
                System.out.print("Enter digit: ");
                digit = sc.nextInt();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
