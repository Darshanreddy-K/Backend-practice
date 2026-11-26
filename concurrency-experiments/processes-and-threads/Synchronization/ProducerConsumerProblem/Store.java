package Synchronization.ProducerConsumerProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {

    private int maxSize;
    private List<Object> items;
    private Lock lock = new ReentrantLock();

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(maxSize);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public  void addItem(Object item)
    {
//        if(items.size() < maxSize)
//            {
//                items.add(item);
//                System.out.println("Producer has added item. Size of items: " + items.size());
//            }
        lock.lock();
        items.add(item); //O(1) so feels parallelized, even though due to lock it is serial
        System.out.println("Producer has added item. Size of items: " + items.size());
        lock.unlock();
    }

    public void removeItem()
    {
//        if(!items.isEmpty())
//        {
//            items.remove(items.size()-1);
//            System.out.println("Consumer has removed item. Size of items: " + items.size());
//        }
        lock.lock();
        items.remove(items.size()-1);
        System.out.println("Consumer has removed item. Size of items: " + items.size());
        lock.unlock();
    }
}
