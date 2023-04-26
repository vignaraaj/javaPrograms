package others;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateManipulation {
    static LocalDate date1Day;
    static int amt;
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the amount of days");
            amt=sc.nextInt();
            LocalDate today = LocalDate.now();
            System.out.println("Current date: " + today);
            //add 1 day to the current date
            date1Day = today.plus(amt, ChronoUnit.DAYS);
            System.out.println("Delivery date : " + date1Day);
            Date.fun();
        }
}
class Date  {
    static void fun () {
        // LocalDate date1Day = DateManipulation.date1Day;
        System.out.println(LocalDate.now().getDayOfYear());
        if (DateManipulation.date1Day.equals(LocalDate.now().getDayOfMonth())) System.out.println("The wait is over");
        else System.out.println("wait for " + DateManipulation.amt + " days");
    }
}