package eg.edu.alexu.csd.datastructure.queue.cs46;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author wasfy this
 *
 */

public class MyQueueArrayBasedTest {
    /**
     * @author wasfy this
     *
     */

    private static final int MAG_5 = 5;
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testIsEmpty1() {
        MyQueueArray queue = new MyQueueArray(MAG_5);
        assertTrue(queue.isEmpty());
    }
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testIsEmpty2() {
        MyQueueArray queue = new MyQueueArray(MAG_5);
        queue.enqueue(MAG_5);
        assertTrue(!queue.isEmpty());
    }
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testEnqueue() {
        MyQueueArray queue = new MyQueueArray(MAG_5);
        queue.enqueue(MAG_5);
    }
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testDequeue() {
        MyQueueArray queue = new MyQueueArray(MAG_5);
        queue.enqueue(MAG_5);
        assertTrue(MAG_5 == (int) queue.dequeue());
    }
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testGetRightOrder() {
        MyQueueArray queue = new MyQueueArray(MAG_5);
        queue.enqueue(MAG_5);
        queue.enqueue(MAG_5);
        queue.enqueue(MAG_5);
        assertEquals(MAG_5, queue.dequeue());
        assertEquals(MAG_5, queue.dequeue());
        assertEquals(MAG_5, queue.dequeue());
    }
    /**
     * @author wasfy this
     *
     */

    @Test(expected = RuntimeException.class)
    public void testDequeueEmpty() {
        MyQueueArray queue = new MyQueueArray(MAG_5);
        queue.dequeue();
    }
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testEmpty() {
        MyQueueArray queue = new MyQueueArray(MAG_5);
        queue.enqueue(MAG_5);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
