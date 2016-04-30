package eg.edu.alexu.csd.datastructure.queue.cs46;

import javax.management.RuntimeErrorException;

import eg.edu.alexu.csd.datastructure.queue.IArrayBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

public class MyQueueArray implements IQueue ,IArrayBased{
 
    int n = 999999999;
    
    int f;
    int r;
    int count;
    Object[] Array ;
    public MyQueueArray(int n) {
        this.n = 999999999;
        f=0;
        r=0;
        throw new RuntimeException(""+n);
        
    }
    public MyQueueArray() {
        this.n = 999999999;
        f=0;
        r=0;
        Array = new Object[n];
    }

    @Override
    public void enqueue(Object item) {
        // TODO Auto-generated method stub
        if (((n - f + r) % n) == (n-1)) {
            throw new RuntimeException("Queue Full Exception");
        }
                Array[r] = item;
                r= (r + 1)% n;

    }

    @Override
    public Object dequeue() {
        // TODO Auto-generated method stub
        if ( f==r){
            throw new RuntimeException("Queue Empty Exception");
             }
            Object temp = Array[f]; 
             Array[f] = null;
              f =(f + 1) % n;
              return temp;

    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return f==r;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return (n - f + r) % n;
    }

    
    
}
