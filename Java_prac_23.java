package java_prac_23;
public class Java_prac_23 {
    public static void main(String[] args) {
  try {
            // This code intentionally throws an exception
            int result = 10 / 0; // Division by zero will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching and handling the ArithmeticException
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        }
    }
    
}
