package eg.edu.alexu.csd.datastructure.stack.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.cs46.OurSingleLinked;
import eg.edu.alexu.csd.datastructure.stack.IStack;

/**
 * @author wasfy this is the stack implementation using linked list
 *
 */
public class MyStack implements IStack {
    /**
     * @author wasfy this is app of project
     */
    OurSingleLinked helplinked = new OurSingleLinked();

    @Override
    public void add(final int index, final Object element) {
        // TODO Auto-generated method stub
        helplinked.add(helplinked.size() - index, element);
    }

    @Override
    public Object pop() {
        // TODO Auto-generated method stub
        Object e;
        e = helplinked.get(0);
        helplinked.remove(0);
        return e;
    }

    @Override
    public Object peek() {
        // TODO Auto-generated method stub
        return helplinked.get(0);
    }

    @Override
    public void push(final Object element) {
        // TODO Auto-generated method stub
        helplinked.add(0, element);
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return helplinked.isEmpty();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return helplinked.size();
    }
}
