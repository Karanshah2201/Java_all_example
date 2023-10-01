import java.io.IOException;

public class Prac_java_33 {
    private static int variable = 0;
/**
 * @param args
 * @throws IOException
 */
public static void main(String[] args) throws IOException {
    Thread thread = new Thread(() -> {
        while (true) {
            // Increment the variable by one.
            variable++;

            // Display the value of the variable.
            System.out.println(variable);

            // Wait for one second.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    // Start the thread.
    thread.start();

    // Keep the main thread running until the user presses Enter.
    System.in.read();
}
}
