package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

public class LinkedListTest {

  OurSingleLinked test = new OurSingleLinked();
  ILinkedList sub;

  @Test
  public void add() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    assertEquals(test.get(2), 6);
 
  }

  @Test
  public void empty() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    test.clear();
    assertTrue(test.isEmpty());
  }

  @Test(expected = RuntimeException.class)
  public void addingOutOfList() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    test.add(9, 6); // 5 1 6 6
  }

  @Test
  public void get() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    Integer[] ar = { 5, 1, 6, 6 };
    Integer[] toget = new Integer[4];
    for (int i = 0; i < test.size(); i++) {
      toget[i] = (Integer) test.get(i);
    }
    assertArrayEquals(toget, ar);
  }

  @Test
  public void contain() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    assertTrue(test.contains(1));
  }

  @Test
  public void notContain() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    test.add(1, 20); // 5 20 1 6 6
    assertFalse(test.contains(40));
  }

  @Test
  public void size() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    test.add(1, 20); // 5 20 1 6 6
    int sizeTest = test.size();
    test.remove(0); // 20 1 6 6
    assertEquals(test.size(), sizeTest - 1);
  }

  @Test
  public void afterRemove() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    test.add(1, 20); // 5 20 1 6 6
    test.remove(3);
    Integer[] ar = { 5, 20, 1, 6 };
    Integer[] toget = new Integer[4];
    for (int i = 0; i < test.size(); i++) {
      toget[i] = (Integer) test.get(i);
    }
    assertArrayEquals(toget, ar);
  }

  @Test(expected = RuntimeException.class)
  public void removeOutOfRange() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    test.add(1, 20); // 5 20 1 6 6
    test.remove(-1);
  }

  @Test
  public void set() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    test.add(1, 20); // 5 20 1 6 6
    test.set(2, 60);
    assertEquals(test.get(2), 60);
  }

  @Test
  public void subList() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    sub = test.sublist(1, 2);
    Integer[] taken = { 1, 6 };
    Integer[] inSubList = new Integer[2];
    for (int i = 0; i < sub.size(); i++) {
      inSubList[i] = (Integer) sub.get(i);
    }
    assertArrayEquals(inSubList, taken);
  }

  @Test
  public void subListSize() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    sub = test.sublist(1, 2);
    assertEquals(sub.size(), 2);
  }

  @Test(expected = RuntimeException.class)
  public void addingNull() {
    test.add(1); // 1
    test.add(0, 5); // 5 1
    test.add(6); // 5 1 6
    test.add(3, 6); // 5 1 6 6
    test.add(null);
    assertTrue(test.contains(null));
  }
}