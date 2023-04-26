package logicalProgOnNumbers;

public class BalancedPrimeNumber {
        public boolean isPrime(int num) {
            if(num == 0 || num == 1) return false; // Math.sqrt method returns double therefore, we have to change it to int
            int n = (int)Math.sqrt(num); // reaching here means we have got a factor that is not 1 and the number num hence the number num is not prime, and we return false
            for(int i = 2; i <= n; i++) if(num % i == 0) return false;
            return true;
        }
        public boolean isBalancedPrime(int num) {
            float f = num; // for storing the previous prime by keeping the current num as the reference
            float prvNum = -1f; // for storing the next prime by keeping the current num as the reference
            float nextNum;
            for(float i = num - 1f; i >= 2f; i--) { // computing the immediate previous prime
                if(isPrime((int)i)) {
                    prvNum = i;
                    break;
                }
            }
            for(float j = num + 1f; true; j++) { // computing the immediate next prime
                if(isPrime((int)j)){
                    nextNum = j;
                    break;
                }
            }
            // reaching here means the previous prime number is not found
            if(prvNum == -1f) return false;
            // computing the average of the prvNum and the nextNum
            float avg = (prvNum + nextNum) / 2f;
            if(f == avg) return true;
            return false;
        }
        public static void main(String args[]) {
            BalancedPrimeNumber obj = new BalancedPrimeNumber();
            System.out.println("Total number of balanced primes from 1 to 200 is: ");
            for(int i = 1; i <= 200; i++) if(obj.isPrime(i) && obj.isBalancedPrime(i)) System.out.print(i + " ");
        }
}
