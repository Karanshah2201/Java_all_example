package java_prac_24;
// Custom checked exception

import java.io.IOException;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
// Custom unchecked exception
class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}
public class Java_prac_24 {
    public static void main(String[] args) {
 try {
            // Example of throwing a checked exception using "throw"
            throw new CustomCheckedException("This is a custom checked exception.");
        } catch (CustomCheckedException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        try {
            // Example of throwing an unchecked exception using "throw"
            throw new CustomUncheckedException("This is a custom unchecked exception.");
        } catch (CustomUncheckedException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }

        // Differentiating between checked and unchecked exceptions
        try {
            // Attempting to throw a checked exception without handling it
            throw new IOException("This is a checked exception.");
        } catch (IOException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }
        // Attempting to throw an unchecked exception without handling it
        throw new NullPointerException("This is an unchecked exception.");
    }   
}
