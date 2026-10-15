public class NumberPrinter implements Runnable {
    public void print()
    {
        for(int i=0; i<100; i++)
        {
            System.out.println(i);
        }
    }

    @Override
    public void run()
    {
        print();
    }

}
