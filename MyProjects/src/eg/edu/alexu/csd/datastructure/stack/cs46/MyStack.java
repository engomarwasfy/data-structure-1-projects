package eg.edu.alexu.csd.datastructure.stack.cs46;

import eg.edu.alexu.csd.datastructure.stack.IStack;

public class MyStack implements IStack {

    private int size = 0;
    private Object[] Stack;

    public MyStack() {
       Stack = new Object[999999];
       size=0;
    }

    @Override
    public void add(final int index, final Object element) {
        // TODO Auto-generated method stub
        if (index >= 0 && index <= size + 1) {
            MyStack help = new MyStack();
            for (int i = size; i >= index; i--) {
                help.push(this.pop());
            }
            this.push(element);
            while (help.size != 0) {
                this.push(help.pop());
            }
        }
        else {
            throw new RuntimeException("Check your inputs");
        }
    }

    @Override
    public Object pop() {
        // TODO Auto-generated method stub
        Object e;
        if (size == 0) {
            throw new RuntimeException("Check your inputs");
        } else {
            e = Stack[size];
            Stack[size] = null;
            size--;
            return e;
        }
    }

    @Override
    public Object peek() {
        // TODO Auto-generated method stub
        if (size == 0) {
            throw new RuntimeException("Check your inputs");
        } else {
            return Stack[size];
        }
    }

    @Override
    public void push(final Object element) {
        // TODO Auto-generated method stub
        size++;
        Stack[size] = element;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size == 0;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }
}

