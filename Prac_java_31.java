import java.util.concurrent.*;
class SumTask implements Callable<Long> {
    private final long start;
    private final long end;

    public SumTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() {
        long sum = 0;
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
public class Prac_java_31 {
    public static void main(String[] args){
   if (args.length != 2) 

{
            System.out.println("Usage: java ParallelSummation <N> <numThreads>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int numThreads = Integer.parseInt(args[1]);

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        long sum = 0;
        long chunkSize = (N + numThreads - 1) / numThreads;

        try {
            // Create tasks and submit them to the thread pool
            for (int i = 0; i < numThreads; i++) {
                long start = i * chunkSize + 1;
                long end = Math.min((i + 1) * chunkSize, N);
                Future<Long> future = executorService.submit(new SumTask(start, end));
                sum += future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

        System.out.println("Sum of first " + N + " numbers using " + numThreads + " threads: " + sum);
    }
}