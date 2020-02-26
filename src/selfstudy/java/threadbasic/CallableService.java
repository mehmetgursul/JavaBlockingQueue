package selfstudy.java.threadbasic;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableService {

    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(10);

        Future<Integer> future = service.submit(new Task());

        System.out.println("Before the blocking...");

        Integer result = future.get(); // blocking

        System.out.println("Result of feature is: " + result);

        System.out.println("Thread name END: " + Thread.currentThread().getName());
    }

    static class Task implements Callable {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            return new Random().nextInt();
        }
    }

}