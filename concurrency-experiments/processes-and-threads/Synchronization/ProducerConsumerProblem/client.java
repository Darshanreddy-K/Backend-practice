package Synchronization.ProducerConsumerProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class client {

    public static void main(String[] args) {

        Store s1 = new Store(10);
        Semaphore producerSema = new Semaphore(10);
        Semaphore consumerSema = new Semaphore(0);

        //10 producers
        //28 consumers

        ExecutorService ex = Executors.newCachedThreadPool();

        for(int i = 0; i < 10; i++){
            Producer p1 = new Producer(s1,  producerSema, consumerSema);
            ex.execute(p1);
        }

        for(int i = 0; i < 28; i++){
            Consumer c1 = new Consumer(s1, producerSema, consumerSema);
            ex.execute(c1);
        }

        ex.shutdown();
    }
}
