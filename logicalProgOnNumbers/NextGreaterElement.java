package logicalProgOnNumbers;

import java.util.*;
public class NextGreaterElement {
    public static List<Integer> nextLargerElement(int[] arr, int n) {
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) stack.pop();
            res.add(0, stack.isEmpty() ? -1 : stack.peek());
            stack.push(arr[i]);
        }return res;
    }
    public static void main(String[] args) {
        System.out.println(nextLargerElement(new int[]{ 6, 8, 0, 1, 3},5));
    }
}
