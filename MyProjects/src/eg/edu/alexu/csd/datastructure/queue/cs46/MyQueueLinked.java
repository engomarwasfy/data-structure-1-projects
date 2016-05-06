package eg.edu.alexu.csd.datastructure.queue.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.cs46.OurSingleLinked;
import eg.edu.alexu.csd.datastructure.queue.ILinkedBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

/**
 * @author wasfy
 *
 */

public class MyQueueLinked implements IQueue, ILinkedBased {
    /**
     * @author wasfy
     *
     */
    OurSingleLinked help = new OurSingleLinked();

    @Override
    /**
     * @author wasfy
     *
     */
    public void enqueue(final Object item) {
        // TODO Auto-generated method stub
        help.add1(item);
    }
    /**
     * @author wasfy
     *
     */
    @Override
    public Object dequeue() {
        // TODO Auto-generated method stub
        Object e;
        e = help.get1();
        help.remove1();
        return e;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return help.isEmpty();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return help.size();
    }
}
