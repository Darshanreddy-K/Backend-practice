package Threads.Example2;

public class NumberPrinter implements Runnable {
    public void print()
    {
        for(int i=0; i<100000; i++)
        {
            System.out.println("Number " + i + " Printed by Thread: " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run()
    {
        print();
    }

}
