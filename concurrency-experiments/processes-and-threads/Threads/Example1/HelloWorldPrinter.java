package Threads.Example1;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        print();
    }
    public void print()
    {
        System.out.println("Hello World from: " + Thread.currentThread().getName() );
    }

}
