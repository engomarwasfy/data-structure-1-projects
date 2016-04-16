package eg.edu.alexu.csd.datastructure.stack.cs46;
import eg.edu.alexu.csd.datastructure.stack.IStack;
class node {
    public Object value;
    public node next;

    public node(final Object value) {
        this.value = value;
        next = null;
    }
}

public class MyStack implements IStack {

    private int size = 0;
    private node Head;
    private node cur;

    public MyStack() {
        Head = null;
        cur = Head;
    }
    @Override
    public void add(int index, Object element) {
        // TODO Auto-generated method stub
    /*    if (index > size || element == null || index < 0) {
            throw new RuntimeException("Check your inputs");
        }
        node newElement = new node(element);
        if (Head == null ) {
            Head = newElement;
        } else if (index == 0)
        {
          newElement.next =Head;
          Head = newElement;
        }
        else {
            cur = Head;
            for (int i = 1; i < index; i++) {
                cur = cur.next;
            }
            newElement.next = cur.next;
            cur.next = newElement;
        }
        size++;
    
    
    */
    }


    @Override
    public Object pop() {
        // TODO Auto-generated method stub
        cur = Head;
        for (int i = 0; i < size-1; i++) {
            cur = cur.next;
        }
        Object  get=cur.value;
        remove(size-1);
        size--;
        return get;
        
    }

    @Override
    public Object peek() {
        // TODO Auto-generated method stub
        cur = Head;
        for (int i = 0; i < size; i++) {
            cur = cur.next;
        }
        return cur.value;
    }

    @Override
    public void push(Object element) {
        // TODO Auto-generated method stub
        if (element != null) {
            node newElement = new node(element);
            cur = Head;
            if (Head == null) {
                Head = newElement;
            } else {
                for (int i = 0; i < size - 1; i++) {
                    cur = cur.next;
                }
                newElement.next = null;
                cur.next = newElement;
            }
            size++;
        }
    }
    

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size==0;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }
// i decremented the size in the method above not here
    public void remove(final int index) {
        // TODO Auto-generated method stub
        if (index >= size || index < 0) {
            throw new RuntimeException("Check your inputs");
        }
        if (index == 0) {
            Head = Head.next;
        } else {
            cur = Head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            cur.next = (cur.next).next;
        }
    }
}
