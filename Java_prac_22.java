package java_prac_22;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Java_prac_22 {
    public static void main(String[] args) {    Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer value for x: ");
            int x = scanner.nextInt();

            System.out.print("Enter an integer value for y: ");
            int y = scanner.nextInt();

            if (y == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            int result = x / y;
            System.out.println("Result of x / y: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
    }
    }
}
