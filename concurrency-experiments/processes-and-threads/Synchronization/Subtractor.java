package Synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    private Value value;
    //private Lock lock;

    public Subtractor(Value value)
    {
        //this.lock = lock;
        this.value = value;
    }

//public Void call() throws  Exception {
//        for(int i=0; i<=100;i++)
//        {
//            lock.lock();
//            this.value.setX(this.value.getX()-i);
//            lock.unlock();
//        }
//        return null;
//    }

//    @Override
//    public Void call() {
//        for(int i=0; i<=100; i++)
//        {
//            synchronized(value)
//            {
//                this.value.setX(this.value.getX()-i);
//            }
//        }
//        return null;
//    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i <= 100; i++) {
            this.value.decrementBy(i);
        }
        return null;
    }
}
