package eg.edu.alexu.csd.datastructure.linkedList.cs46;


import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

/**
 * @author wasfy
 * this is test
 *
 */
class node {

    /**
     * @author wasfy
     * this is test
     *
     */
	public Object value;

	  /**
	   * @author wasfy
	   * this is test
	   *
	   */
	public node next;

	/**
     * @author wasfy
     * this is test
     * @param value test
     */
	 node(final Object value) {
		this.value = value;
		next = null;
	}
}

/**
 * @author wasfy
 * this is test
 *
 */

public class OurSingleLinked implements ILinkedList {


    /**
     * @author wasfy
     * this is test
     *
     */
	private int size = 0;

	  /**
	   * @author wasfy
	   * this is test
	   *
	   */
	private node Head;

	  /**
	   * @author wasfy
	   * this is test
	   *
	   */
	private node cur;

	  /**
	   * @author wasfy
	   * this is test
	   *
	   */
	public OurSingleLinked() {
		Head = null;
		cur = Head;
	}

	/**
     * @author wasfy
     * this is test
     * @param index test
     * @param element test
     */
	public void add(final int index, final Object element) {
		if (index > size || element == null || index < 0) {
            throw new RuntimeException("Check your inputs");
        }
		node newElement = new node(element);
		if (Head == null) {
            Head = newElement;
        } else if (index == 0) {
		  newElement.next = Head;
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
	}

	/**
     * @author wasfy
     * this is test
     * @param element test
     */
	public void add(final Object element) {
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

	/**
     * @author wasfy
     * this is test
     * @param index test
     * @return Object
     */
	public Object get(final int index) {
		//throw new RuntimeException(String.valueOf(index));
		if (index >= size || index < 0) {
            throw new RuntimeException("Check your inputs");
        }
		cur = Head;
		for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
		return cur.value;
	}

	/**
     * @author wasfy
     * this is test
     * @param index test
     * @param element test
     */
	public void set(final int index, final Object element) {
		// TODO Auto-generated method stub
		cur = Head;
		for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
		cur.value = element;
	}

	  /**
	   * @author wasfy
	   * this is test
	   *
	   */
	public void clear() {
		// TODO Auto-generated method stub
		Head = null;
		size = 0;
	}

	  /**
	   * @author wasfy
	   * this is test
	   *@return test
	   */
	public boolean isEmpty() {
		return Head == null;
	}

	/**
     * @author wasfy
     * this is test
     * @param index test
     */
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
		size--;
	}

	  /**
	   * @author wasfy
	   * this is test
	   *
	   */
	public int size() {
		return size;

	}

	/**
     * @author wasfy
     * this is test
     * @param fromIndex test
     * @param toIndex test
     * @return Object
     */
	public ILinkedList sublist(final int fromIndex, final int toIndex) {
		// TODO Auto-generated method stub
		if (fromIndex >= size || toIndex >= size || fromIndex < 0 || toIndex < 0) {
            throw new RuntimeException("Check your inputs");
        }
		cur = Head;
		for (int i = 0; i < fromIndex; i++) {
            cur = cur.next;
        }
		OurSingleLinked sub = new OurSingleLinked();
		for (int i = fromIndex; i <= toIndex; i++) {
			sub.add(cur.value);
			cur = cur.next;
		}
		return sub;
	}

	  /**
	   * @author wasfy
	   * this is test
	   *@param o test
	   *@return test
	   */
	public boolean contains(final Object o) {
		// TODO Auto-generated method stub
		cur = Head;
		for (int i = 0; i < size; i++) {
			if (o.equals(cur.value)) {
                return true;
            }
			cur = cur.next;
		}
		return false;
	}
}