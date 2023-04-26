package logicalProgOnNumbers;

public class NextSmallestPalindrome {
    public static int nextSmallestPalindrome(int num) {
        if (num < 10) return num + 1;
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;
        int mid = n / 2;
        boolean isLeftSmaller = false;
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;
        while (i >= 0 && numArr[i] == numArr[j]) {
            i--;
            j++;
        }
        if (i < 0 || numArr[i] < numArr[j]) isLeftSmaller = true;
        while (i >= 0) numArr[j++] = numArr[i--];
        if (isLeftSmaller) {
            int carry = 1;
            i = mid - 1;
            if (n % 2 == 1) {
                numArr[mid] = (char) ((numArr[mid] - '0' + 1) + '0');
                carry = numArr[mid] / 10;
                numArr[mid] %= 10;
                j = mid + 1;
            } else j = mid;
            while (i >= 0) {
                int sum = numArr[i] - '0' + carry;
                carry = sum / 10;
                numArr[i] = (char) (sum % 10 + '0');
                numArr[j++] = numArr[i--];
            }
        }return Integer.parseInt(new String(numArr));
    }
    public static void main(String[] args) {
        System.out.println(nextSmallestPalindrome(2041));
    }
}
