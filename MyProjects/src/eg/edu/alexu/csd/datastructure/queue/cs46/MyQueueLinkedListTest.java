package eg.edu.alexu.csd.datastructure.queue.cs46;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author wasfy this
 *
 */

public class MyQueueLinkedListTest {
    /**
     * @author wasfy this
     *
     */
    private static final int m5 = 5;
    /**
     * @author wasfy this
     *
     */
    @Test
    public void testIsEmpty1() {
        MyQueueLinked queue = new MyQueueLinked();
        assertTrue(queue.isEmpty());
    }
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testIsEmpty2() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(m5);
        assertTrue(!queue.isEmpty());
    }
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testEnqueue() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(m5);
    }
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testDequeue() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(m5);
        assertTrue(m5 == (int) queue.dequeue());
    }
    /**
     * @author wasfy this
     *
     */

    @Test
    public void testGetRightOrder() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(m5);
        queue.enqueue(m5);
        queue.enqueue(m5);
        assertEquals(m5, queue.dequeue());
        assertEquals(m5, queue.dequeue());
        assertEquals(m5, queue.dequeue());
    }
    /**
     * @author wasfy this
     *
     */

    @Test(expected = RuntimeException.class)
    public void testDequeueEmpty() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.dequeue();
    }
    /**
     * @author wasfy this
     *
     */


    @Test
    public void testEmpty() {
        MyQueueLinked queue = new MyQueueLinked();
        queue.enqueue(m5);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

}
