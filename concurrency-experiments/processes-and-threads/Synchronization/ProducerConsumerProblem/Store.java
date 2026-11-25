package Synchronization.ProducerConsumerProblem;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private int maxSize;
    private List<Object> items;

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

    public synchronized void addItem(Object item)
    {
        if(items.size() < maxSize)
            {
                items.add(item);
                System.out.println("Producer has added item. Size of items: " + items.size());
            }
    }

    public synchronized void removeItem()
    {
        if(!items.isEmpty())
        {
            items.remove(items.size()-1);
            System.out.println("Consumer has removed item. Size of items: " + items.size());
        }
    }
}
