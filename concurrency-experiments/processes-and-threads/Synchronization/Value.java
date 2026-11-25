package Synchronization;

public class Value {

    private int x;

    public Value(int x)
    {
        this.x = x;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public synchronized void incrementBy(int i)
    {
        x += i;
    }

    public synchronized void decrementBy(int i)
    {
        x -= i;
    }
}
