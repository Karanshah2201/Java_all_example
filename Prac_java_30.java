class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
public class Prac_java_30 {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    } 
}
