package Threads.Example1;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main is running in: " + Thread.currentThread().getName());

        HelloWorldPrinter task = new HelloWorldPrinter();
        Thread t = new Thread(task);
        t.start();
    }
}
