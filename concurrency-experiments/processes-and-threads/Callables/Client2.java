package Callables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Client2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService pool = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors());

        List<Integer> data = new ArrayList<>(
                Arrays.asList(45, 34, 43, 34, 46, 3, 36, 3257, 5626)
        );

        Future<List<Integer>> result = pool.submit(new MergeSortTask(data, pool));
        System.out.println(result.get());   // sorted output

        pool.shutdown();

    }
}
