package eg.edu.alexu.csd.datastructure.stack.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.cs46.OurDoubleLinkedList;
import eg.edu.alexu.csd.datastructure.linkedList.cs46.OurSingleLinked;
import eg.edu.alexu.csd.datastructure.stack.IStack;

public class MyStack implements IStack {

    private int size = 0;
    private int top =-1;
    private Object[] Stack;

    public MyStack() {
       Stack = new Object[999999];
       size=0;
       top=-1;
    }

    @Override
    public void add(final int index, final Object element) {
        // TODO Auto-generated method stub
        OurDoubleLinkedList helplinked=new OurDoubleLinkedList();
        for(int i=0;i<size;i++){
            helplinked.add(Stack[i]);
           // System.out.println(Stack[i]);
        }
        helplinked.add(index, element);
    //    for(int i=0;i<size;i++){
      //      Stack[i]=null;
       // }
        for(int i=0;i<helplinked.size();i++){
            Stack[i]=helplinked.get(i);
        }
        size++;
        top++;
    }
    @Override
    public Object pop() {
        // TODO Auto-generated method stub
        Object e;
        if (size == 0) {
            throw new RuntimeException("Check your inputs from pop");
        } else {
            e = Stack[top];
            Stack[top] = null;
            top--;
            size--;
            return e;
        }
    }

    @Override
    public Object peek() {
        // TODO Auto-generated method stub
        if (size == 0) {
            throw new RuntimeException("Check your inputs from peek");
        } else {
            return Stack[top];
        }
    }

    @Override
    public void push(final Object element) {
        // TODO Auto-generated method stub
        top++;
        Stack[top] = element;
        size++;
        
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
    public Object[] get(){
        
        return Stack;
    }
    }


/*    if (index >=0  && index <= size + 1) {
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
throw new RuntimeException("Check your inputs from add");
}
}*/


