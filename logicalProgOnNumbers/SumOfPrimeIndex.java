package logicalProgOnNumbers;
class SumOfPrimeIndex {
    public static void main(String[] args) {
        int[] a = {-1,-2,-3,3,4,-7};
        int b =sumOfPrimeIndexValues(a);
        System.out.println(b);
    }
    public static int sumOfPrimeIndexValues(int[] a){
        int k = 0;
        for (int i = 2; i < a.length; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) if (i % j == 0) c++;
            if (c == 2) k += a[i];
        }
        return k;
    }
}