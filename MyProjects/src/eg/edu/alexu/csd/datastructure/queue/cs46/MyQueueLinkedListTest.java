package eg.edu.alexu.csd.datastructure.queue.cs46;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueLinkedListTest {

    @Test
    public void testIsEmpty1() {
        MyQueueLinked queue = new MyQueueLinked();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(5);
        assertTrue(!queue.isEmpty());
    }

    @Test
    public void testEnqueue() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(5);
    }

    @Test
    public void testDequeue() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(5);
        assertTrue(5 == (int) queue.dequeue());
    }

    @Test
    public void testGetRightOrder() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test(expected = RuntimeException.class)
    public void testDequeueEmpty() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.dequeue();
    }

    @Test
    public void testEmpty() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(5);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

}
