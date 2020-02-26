package selfstudy.java.threadbasic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) throws Exception {


        //1. Basic 
        // ExecutorService service = Executors.newFixedThreadPool(10);

        //2. CPU intensive task
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

// 1. Basic
//        for (int i = 0; i < 100; i++) {
//            service.execute(new Task());
//        }

// 2. CPU intensive task
        for (int i = 0; i < 100; i++) {
            service.execute(new CPUIntensiveTask());
        }

        System.out.println("Thread name END: " + Thread.currentThread().getName());
    }

// 1. Basic
//    static class Task implements Runnable {
//        @Override
//        public void run() {
//            System.out.println("Thread name: " + Thread.currentThread().getName());
//        }
//    }

// 2. CPU intensive task
    static class CPUIntensiveTask implements Runnable {
        @Override
        public void run() {
            // CPU intensive operations
        }
    }

}