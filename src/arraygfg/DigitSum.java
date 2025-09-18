package arraygfg;

public class DigitSum {
    public static int repeatedSum(int n) {
        while (n >= 10) {  // keep going until single digit
            int sum = 0;
            while (n > 0) {
                sum += n % 10;  // extract last digit
                n /= 10;
            }
            n = sum; // replace n with sum of digits
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSum(1234)); // 1
        System.out.println(repeatedSum(5674)); // 4
    }
}
