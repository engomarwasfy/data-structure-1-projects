package eg.edu.alexu.csd.datastructure.linkedList;

public interface ILinkedList {
	/**
	* Inserts a specified element at the specified sposition in the list.
	*/
	void add(int index, Object element);
	/** Inserts the specified element at the end of the list. */
	void add(Object element);
	/** Returns the element at the specified position in this list. */
	Object get(int index);
	/**
	* Replaces the element at the specified position in this list with
	* the specified element.
	*/
	void set(int index, Object element);
	/** Removes all of the elements from this list. */
	void clear();
	/** Returns true if this list contains no elements. */
	boolean isEmpty();
	/** Removes the element at the specified position in this list. */
	void remove(int index);
	/** Returns the number of elements in this list. */
	int size();
	/**
	  Returns a view of the portion of this list between the specified
	* fromIndex and toIndex, inclusively.
	*/
	ILinkedList sublist(int fromIndex, int toIndex);
	/**
	* Returns true if this list contains an element with the same value
	* as the specified element.
	*/
	boolean contains(Object o);
}
