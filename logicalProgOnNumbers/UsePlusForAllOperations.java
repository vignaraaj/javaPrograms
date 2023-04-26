package logicalProgOnNumbers;

import java.util.*;
public class UsePlusForAllOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = scanner.nextInt();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a + (~b + 1))); // ~b + 1 is equivalent to -b
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }
    public static int multiply(int a, int b) {
        int result = 0;
        boolean isNegative = false;
        if (a < 0 && b > 0 || a > 0 && b < 0) isNegative = true;
        a = Math.abs(a);
        b = Math.abs(b);
        for (int i = 0; i < b; i++) result += a;
        return isNegative ? -result : result;
    }
    public static int divide(int dividend, int divisor) {
        boolean isNegative = false;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) isNegative = true;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;
        while (dividend >= divisor) {
            dividend = subtract(dividend, divisor);
            quotient++;
        }
        return isNegative ? -quotient : quotient;
    }
    public static int subtract(int a, int b) {
        return a + (~b + 1);
    }
}
