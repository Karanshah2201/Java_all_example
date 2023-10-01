import java.util.ArrayList;
import java.util.List;

class CustomStack {
    private List<Object> list;

    public CustomStack() {
        list = new ArrayList<>();
    }

    public synchronized boolean isEmpty() {
        return list.isEmpty();
    }

    public synchronized int getSize() {
        return list.size();
    }

    public synchronized Object peek() {
        if (isEmpty()) {
            return null; // Stack is empty
        }
        return list.get(list.size() - 1); // Get the top element
    }

    public synchronized Object pop() {
        if (isEmpty()) {
            return null; // Stack is empty
        }
        Object top = list.get(list.size() - 1); // Get the top element
        list.remove(list.size() - 1); // Remove the top element
        return top;
    }

    public synchronized void push(Object o) {
        list.add(o); // Add a new element to the top
    }
}

class Producer extends Thread {
    private CustomStack stack;

    public Producer(CustomStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            stack.push("Item " + i);
            System.out.println("Produced: Item " + i);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private CustomStack stack;

    public Consumer(CustomStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            Object item = stack.pop();
            if (item != null) {
                System.out.println("Consumed: " + item);
            } else {
                System.out.println("Stack is empty.");
            }
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Prac_java_35 {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        Producer producer = new Producer(stack);
        Consumer consumer = new Consumer(stack);

        producer.start();
        consumer.start();
    }
}