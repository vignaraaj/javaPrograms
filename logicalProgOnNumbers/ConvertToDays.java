package logicalProgOnNumbers;

public class ConvertToDays {
    //this conversion is based on julian calendar
    public static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        int dn1 = convertToDays(d1, m1, y1);
        int dn2 = convertToDays(d2, m2, y2);
        return Math.abs(dn2 - dn1);
    }

    private static int convertToDays(int day, int month, int year) {
        int a = (14 - month) / 12;
        int y = year + 4800 - a;
        int m = month + 12 * a - 3;
        return day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
    }

    public static void main(String[] args) {
        System.out.println(noOfDays(3,12,2023,23,12,2023));
    }
}
