package Callables;

import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService fixed = Executors.newFixedThreadPool(5);

        Future<Integer> fa = fixed.submit(new NumberGenerator(5));
        Future<Integer> fb = fixed.submit(new NumberGenerator(4));
        System.out.println("main keeps going");
        int total = fa.get() + fb.get();
        System.out.println("Result: " + total);
        fixed.shutdown();
    }
}
