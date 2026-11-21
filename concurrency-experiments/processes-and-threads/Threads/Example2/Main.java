package Threads.Example2;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello");

        NumberPrinter numberPrinter = new NumberPrinter();
        Thread t1 = new Thread(numberPrinter);
        t1.start();

        for(int i=0; i<100; i++) {
            IndividualNumberPrinter num = new IndividualNumberPrinter(i);
            Thread t = new Thread(num);
            t.start();
        }

        System.out.println("Hello");
    }

}