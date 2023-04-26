package logicalProgOnNumbers;
import java.util.Scanner;
public class AddDigitAndReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number1 = sc.nextInt();
        int number2 =number1;
        int res = 0;
        while(number1>0) {
            res += number1%10;
            number1 /= 10;
        }
        System.out.println("sum of the digits is : " + res);
        int  reverse = 0;
        while(number2 != 0) {
            int remainder = number2 % 10;
            reverse = reverse * 10 + remainder;
            number2 = number2/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);

    }

}
