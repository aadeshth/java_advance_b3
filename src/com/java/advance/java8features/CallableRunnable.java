package com.java.advance.java8features;

import java.util.concurrent.*;

public class CallableRunnable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t1 = new Thread(() -> System.out.println("Runnable...."));
        t1.start();

        Callable<String> callable = ()-> "Callable....";
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> futute = executorService.submit(callable);
        System.out.println(futute.get());
        executorService.shutdown();

    }


}
