import java.util.Random;
class NumberGeneratorThread extends Thread {
    private Random random = new Random();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(10); // Generate a random integer between 0 and 10
            System.out.println("Generated Number: " + randomNumber);

            if (randomNumber % 2 == 0) {
                synchronized (Prac_java_32.lock) {
                    Prac_java_32.evenNumber = randomNumber;
                    Prac_java_32.isEvenReady = true;
                    Prac_java_32.lock.notifyAll();
                }
            } else {
                synchronized (Prac_java_32.lock) {
                    Prac_java_32.oddNumber = randomNumber;
                    Prac_java_32.isOddReady = true;
                    Prac_java_32.lock.notifyAll();
                }
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (Prac_java_32.lock) {
                while (!Prac_java_32.isEvenReady) {
                    try {
                        Prac_java_32.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int square = Prac_java_32.evenNumber * Prac_java_32.evenNumber;
                System.out.println("Square: " + square);
                Prac_java_32.isEvenReady = false;
            }
        }
    }
}

class CubeThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (Prac_java_32.lock) {
                while (!Prac_java_32.isOddReady) {
                    try {
                        Prac_java_32.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int cube = Prac_java_32.oddNumber * Prac_java_32.oddNumber * Prac_java_32.oddNumber;
                System.out.println("Cube: " + cube);
                Prac_java_32.isOddReady = false;
            }
        }
    }
}
    
    public class Prac_java_32 {
        public static final Object lock = new Object();
        public static int evenNumber;
        public static int oddNumber;
        public static boolean isEvenReady = false;
        public static boolean isOddReady = false;
    
        public static void main(String[] args) {
            NumberGeneratorThread numberGeneratorThread = new NumberGeneratorThread();
            SquareThread squareThread = new SquareThread();
            CubeThread cubeThread = new CubeThread();
            numberGeneratorThread.start();
            squareThread.start();
            cubeThread.start();
}
}
