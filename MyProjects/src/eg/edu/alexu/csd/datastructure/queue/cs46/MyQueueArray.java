package eg.edu.alexu.csd.datastructure.queue.cs46;

import eg.edu.alexu.csd.datastructure.queue.IArrayBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

/**
 * @author wasfy
 *
 */
public class MyQueueArray implements IQueue, IArrayBased {
    /**
     * @author wasfy
     *
     */
    private static final int MAG = 99999999;
    /**
     * @author wasfy
     *
     */
    private static final int MAGO = 50;
    /**
     * @author wasfy
     *
     */
    int n = MAG;
    /**
     * @author wasfy
     *
     */
    int f;
    /**
     * @author wasfy
     *
     */
    int r;
    /**
     * @author wasfy
     *
     */
    int count;
    /**
     * @author wasfy
     *
     */
    Object[] Array;

    /**
     * @author wasfy
     * @param n
     *            test
     */
    public MyQueueArray(final int n) {
        this.n = n + 1;
        f = 0;
        r = 0;
        Array = new Object[n + MAGO];
    }

    /**
     * @author wasfy
     *
     */
    public MyQueueArray() {
        this.n = MAG + 1;
        f = 0;
        r = 0;
        Array = new Object[this.n];
    }

    @Override
    public void enqueue(final Object item) {
        // TODO Auto-generated method stub
        if (((n - f + r) % n) == (n - 1)) {
            throw new RuntimeException("Queue Full Exception");
        }
        Array[r] = item;
        r = (r + 1) % n;

    }

    @Override
    public Object dequeue() {
        // TODO Auto-generated method stub
        if (f == r) {
            throw new RuntimeException("Queue Empty Exception");
        }
        Object temp = Array[f];
        Array[f] = null;
        f = (f + 1) % n;
        return temp;

    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return f == r;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return (n - f + r) % n;
    }

}
