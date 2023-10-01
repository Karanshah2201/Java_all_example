package java_prac_20;
interface AdvancedArithmetic {
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        if (n == 1) {
            return 1;
        }       
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum + n; // Add n itself as a divisor
    }
}
public class Java_prac_20{
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        int n = 6;
        int sumOfDivisors = calculator.divisor_sum(n);
        System.out.println("The sum of divisors of " + n + " is: " + sumOfDivisors); // Output: 12
    }        }
