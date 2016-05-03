package eg.edu.alexu.csd.datastructure.queue.cs46;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueArrayBasedTest {
    int n = 5;

    @Test
    public void testIsEmpty1() {
        MyQueueArray queue = new MyQueueArray(n);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        MyQueueArray queue = new MyQueueArray(n);
        queue.enqueue(5);
        assertTrue(!queue.isEmpty());
    }

    @Test
    public void testEnqueue() {
        MyQueueArray queue = new MyQueueArray(n);
        queue.enqueue(5);
    }

    @Test
    public void testDequeue() {
        MyQueueArray queue = new MyQueueArray(n);
        queue.enqueue(5);
        assertTrue(5 == (int) queue.dequeue());
    }

    @Test
    public void testGetRightOrder() {
        MyQueueArray queue = new MyQueueArray(n);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test(expected = RuntimeException.class)
    public void testDequeueEmpty() {
        MyQueueArray queue = new MyQueueArray(n);
        queue.dequeue();
    }

    @Test
    public void testEmpty() {
        MyQueueArray queue = new MyQueueArray(n);
        queue.enqueue(5);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
