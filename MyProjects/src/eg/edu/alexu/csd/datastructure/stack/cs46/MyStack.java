package eg.edu.alexu.csd.datastructure.stack.cs46;
import eg.edu.alexu.csd.datastructure.linkedList.cs46.OurDoubleLinkedList;
import eg.edu.alexu.csd.datastructure.stack.IStack;
public class MyStack implements IStack {
    OurDoubleLinkedList help;
    public MyStack() {
        help = new OurDoubleLinkedList();
    }
    @Override
    public void add(final int index, final Object element) {
        // TODO Auto-generated method stub
    help.add(index, element);        
    }
    @Override
    public Object pop() {
        // TODO Auto-generated method stub
       Object e = help.get(help.size()-1);
       help.remove(help.size()-1);
       return e;
    }
    @Override
    public Object peek() {
        // TODO Auto-generated method stub
       return  help.get(help.size()-1);
    }
    @Override
    public void push(final Object element) {
        // TODO Auto-generated method stub
     help.add(element); 
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



