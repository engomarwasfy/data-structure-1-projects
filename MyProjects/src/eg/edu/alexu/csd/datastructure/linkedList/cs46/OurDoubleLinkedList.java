package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

class nodeD {
	public Object value;
	public nodeD next;
	public nodeD pre;

	public nodeD(Object value) {
		this.value = value;
		next = null;
		pre = null;
	}
}
public class OurDoubleLinkedList implements ILinkedList {

	private int size = 0;
	private nodeD Head;
	private nodeD cur;

	public OurDoubleLinkedList() {
		Head = null;
		cur = Head;
	}

	public void add(int index, Object element) {
		if (index > size || element == null || index < 0)
			throw new RuntimeException("Check your inputs");
		nodeD newElement = new nodeD(element);
		if (Head == null)
		    Head = newElement;
    else if (index == 0)
    {
      newElement.next =Head;
      Head.pre = newElement;
      Head = newElement;
    }
		else {
			cur = Head;
			for (int i = 1; i < index; i++)
				cur = cur.next;
			newElement.next = cur.next;
			 cur.next = newElement;
			(cur.next).pre=newElement;
			newElement.pre = cur;
		}
		size++;
	}

	public void add(Object element) {
		if (element != null) {
			nodeD newElement = new nodeD(element);
			cur = Head;
			if (Head == null)
				Head = newElement;
			else {
				for (int i = 0; i < size - 1; i++)
					cur = cur.next;
				newElement.next = null;
				newElement.pre = cur;
				cur.next = newElement;
			}
			size++;
		}
	}

	public Object get(int index) {
		// TODO Auto-generated method stub
		if (index >= size || index < 0)
			throw new RuntimeException("Check your inputs");
		cur = Head;
		for (int i = 0; i < index; i++)
			cur = cur.next;
		return cur.value;
	}

	public void set(int index, Object element) {
		// TODO Auto-generated method stub
		cur = Head;
		for (int i = 0; i < index; i++)
			cur = cur.next;
		cur.value = element;
	}

	public void clear() {
		// TODO Auto-generated method stub
		Head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return Head == null || size == 0;
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		if (index >= size || index < 0)
			throw new RuntimeException("Check your inputs");
		if (index == 0)
			{
		    Head = Head.next;
		    Head.pre = null ;
			}
		else {
			cur = Head;
			for (int i = 0; i < index - 1; i++)
				cur = cur.next;
	     if (index+1 != size) 
	       ((cur.next).next).pre= cur;
			cur.next = (cur.next).next;
			}
		size--;
	}

	public int size() {
		return size;

	}

	public ILinkedList sublist(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
	  if (fromIndex >= size || toIndex >= size || fromIndex < 0 || toIndex < 0)
			throw new RuntimeException("Check your inputs");
		cur = Head;
		for (int i = 0; i < fromIndex; i++)
			cur = cur.next;
		OurSingleLinked sub = new OurSingleLinked();
		for (int i = fromIndex; i <= toIndex; i++) {
			sub.add(cur.value);
			cur = cur.next;
		}
		return sub;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		cur = Head;
		for (int i = 0; i < size; i++) {
			if (o.equals(cur.value))
				return true;
			cur = cur.next;
		}
		return false;
	}

}