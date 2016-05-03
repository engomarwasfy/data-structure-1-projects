package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

/**
 * @author wasfy this is test
 *
 */
class nodes {

    /**
     * @author wasfy this is test
     *
     */
    public Object value;

    /**
     * @author wasfy this is test
     *
     */
    public nodes next;

    /**
     * @author wasfy this is test
     * @param value
     *            test
     */
    nodes(final Object value) {
        this.value = value;
        next = null;
    }
}

/**
 * @author wasfy this is test
 *
 */

public class OurSingleLinkedList {
    /**
     * @author wasfy this is test
     *
     */
    private int size = 0;

    /**
     * @author wasfy this is test
     *
     */
    private nodes Head;
    private nodes tail;

    /**
     * @author wasfy this is test
     *
     */
    private node cur;

    /**
     * @author wasfy this is test
     *
     */
    public OurSingleLinkedList() {
        Head = null;
        tail = Head;
    }

    public void add(final Object element) {
        if (element != null) {
            nodes newElement = new nodes(element);
            if (Head == null) {
                Head = newElement;
                tail = newElement;
                tail.next = null;
            } else {
                tail.next = newElement;
                newElement.next = null;
                tail = newElement;
            }
            size++;
        }
    }

    /**
     * @author wasfy this is test
     * @param index
     *            test
     * @return Object
     */
    public Object get() {
        // throw new RuntimeException(String.valueOf(index));
        if (Head == null) {
            throw new RuntimeException("Check your inputs");
        }
        return Head.value;
    }

    /**
     * @author wasfy this is test
     * @return test
     */
    public boolean isEmpty() {
        return Head == null;
    }

    /**
     * @author wasfy this is test
     * @param index
     *            test
     */
    public void remove() {
        // TODO Auto-generated method stub
        if (size == 0) {
            throw new RuntimeException("Check your inputs");
        } else if (size == 1) {
            Head = null;
            tail = Head;
        } else {
            Head = Head.next;
            // tail will remain unchanged
        }

        size--;
    }

    /**
     * @author wasfy this is test
     *
     */
    public int size() {
        return size;

    }

    // public static void main(final String[] args){
    // OurSingleLinkedList s =new OurSingleLinkedList();
    // s.add(3);
    // //System.out.println(s.get());
    //
    // }
}
