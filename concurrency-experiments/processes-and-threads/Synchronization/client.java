package Synchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v1 = new Value(0);

        //Lock lock = new ReentrantLock();

        Adder adder = new Adder(v1);
        Subtractor subtractor = new Subtractor(v1);
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Void> adderFuture = ex.submit(adder);
        Future<Void> subtractorFuture = ex.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v1.getX());
        ex.shutdown();
    }




}
