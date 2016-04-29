package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

/**
 * @author wasfy
 * this is test
 *
 */
class nodeD {

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
public nodeD next;
       /**
	   * @author wasfy
	   * this is test
	   *
	   */
	public nodeD pre;


	  /**
	   * @author wasfy
	   * this is test
	   *@param value test
	   */
	 nodeD(final Object value) {
		this.value = value;
		next = null;
		pre = null;
	}
}

/**
 * @author wasfy
 * this is test
 *
 */
public class OurDoubleLinkedList implements ILinkedList {


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
	private nodeD Head;

	  /**
	   * @author wasfy
	   * this is test
	   *
	   */
	private nodeD cur;


	  /**
	   * @author wasfy
	   * this is test
	   *
	   */
	public OurDoubleLinkedList() {
		Head = null;
		cur = Head;
	}

	  /**
	   * @author wasfy
	   * this is test
	   *@param index test
	   *@param element test
	   */
	public void add(final int index, final Object element) {
		if (index > size || element == null || index < 0) {
            throw new RuntimeException("Check your inputs");
        }
		nodeD newElement = new nodeD(element);
		if (Head == null) {
            Head = newElement;
        } else if (index == 0) {
      newElement.next = Head;
      Head.pre = newElement;
      Head = newElement;
    }
		else {
			cur = Head;
			for (int i = 1; i < index; i++) {
                cur = cur.next;
            }
			newElement.next = cur.next;
			 cur.next = newElement;
			(cur.next).pre = newElement;
			newElement.pre = cur;
		}
		size++;
	}

	  /**
	   * @author wasfy
	   * this is test
	   *@param element test
	   */
	public void add(final Object element) {
		if (element != null) {
			nodeD newElement = new nodeD(element);
			cur = Head;
			if (Head == null) {
                Head = newElement;
            } else {
				for (int i = 0; i < size - 1; i++) {
                    cur = cur.next;
                }
				newElement.next = null;
				newElement.pre = cur;
				cur.next = newElement;
			}
			size++;
		}
	}

	  /**
	   * @author wasfy
	   * this is test
	   *@param index test
	   *@return test
	   */

	public Object get(final int index) {
		// TODO Auto-generated method stub
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
	   *@param index test
	   *@param element test
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
		return Head == null || size == 0;
	}

	  /**
	   * @author wasfy
	   * this is test
	   *
	   */

	public void remove(final int index) {
		// TODO Auto-generated method stub
		if (index >= size || index < 0) {
            throw new RuntimeException("Check your inputs");
        }
		if (index == 0) {
		    Head = Head.next;
		    Head.pre = null;
			}
		else {
			cur = Head;
			for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
	     if (index + 1 != size) {
            ((cur.next).next).pre = cur;
        }
			cur.next = (cur.next).next;
			}
		size--;
	}

	  /**
	   * @author wasfy
	   * this is test
	   *@return test
	   */
	public int size() {
		return size;

	}

	  /**
	   * @author wasfy
	   * this is test
	   *
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