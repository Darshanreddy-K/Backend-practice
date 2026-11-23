package Executors;

public class IndividualNumberPrinter implements Runnable {

    private int num;

    public IndividualNumberPrinter(int num) {
        this.num = num;
    }

    @Override
    public void run()
    {
        System.out.println("Number: " + num + " Thread: " + Thread.currentThread().getName());
    }



}
