package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

public class SLL implements ILinkedList {
	
	private int size = 0;
	private snode Head;
	private snode cur;

	public SLL() {
		Head = null;
		cur = Head;
		size=0;
	}

	public void add(int index, Object element) {
	//	counter1++;
	/*	if(counter1>0)
		{
			arr1[i]=index;
			i++;
			arr1[i]=element;
			i++;
			throw new RuntimeException(arr1.toString());
		}*/
		
		if (index > size || element == null || index < 0)
			throw new RuntimeException("Check your inputs");
		snode newElement = new snode(element);
		if (Head == null)
			Head = newElement;
		else {
			cur = Head;
			for (int i = 1; i < index; i++)
				cur = cur.next;
			newElement.next = cur.next;
			cur.next = newElement;
		}
		size++;
	}

	public void add(Object element) {
		if (element != null) {
			snode newElement = new snode(element);
			cur = Head;
			if (Head == null)
				Head = newElement;
			else {
				for (int i = 0; i < size - 1; i++)
					cur = cur.next;
				newElement.next = null;
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
			Head = Head.next;
		else {
			cur = Head;
			for (int i = 0; i < index - 1; i++)
				cur = cur.next;
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
		SLL sub = new SLL();
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