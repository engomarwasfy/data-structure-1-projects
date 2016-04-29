package eg.edu.alexu.csd.datastructure.queue.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.cs46.OurDoubleLinkedList;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

public class MyQueueLinked implements IQueue {

    OurDoubleLinkedList help = new OurDoubleLinkedList();
    
    @Override
    public void enqueue(Object item) {
        // TODO Auto-generated method stub
        help.add(item);
    }

    @Override
    public Object dequeue() {
        // TODO Auto-generated method stub
        Object e ;
        e= help.get(0);
        help.remove(0);
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
