public class Prac_java_34 {
    
    public static void main(String[] args) {
        // Create three threads.
        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("FIRST Thread is running with priority " + Thread.currentThread().getPriority());
            }
        }, "FIRST");

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("SECOND Thread is running with priority " + Thread.currentThread().getPriority());
            }
        }, "SECOND");

        Thread thirdThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("THIRD Thread is running with priority " + Thread.currentThread().getPriority());
            }
        }, "THIRD");

        // Set the priorities of the threads.
        firstThread.setPriority(3);
        thirdThread.setPriority(7);

        // Start the threads.
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
