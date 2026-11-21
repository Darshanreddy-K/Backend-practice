package ExecutorsAndCallables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService fixed = Executors.newFixedThreadPool(5);
        ExecutorService cached = Executors.newCachedThreadPool();

        for(int i=0; i<1000000; i++)
        {
            fixed.execute(new IndividualNumberPrinter(i));

        }
        fixed.shutdown();
    }
}
