package eg.edu.alexu.csd.datastructure.linkedList.cs46;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;
/**
 * @author wasfy this is linkedlist test
 *
 */
public class LinkedListTest {
    /**
     * @author wasfy this is linked
     *
     */
    private static final int MAG_0 = 0;
    /**
     * @author wasfy this is linked
     *
     */
    private static final int MAG_1 = 1;
    /**
     * @author wasfy this is linked
     *
     */
    private static final int MAG_5 = 5;
    /**
     * @author wasfy this is linked
     *
     */
    private static final int MAG_6 = 6;
    /**
     * @author wasfy this is linked
     *
     */
    private static final int MAG_3 = 3;
    /**
     * @author wasfy this is linked
     *
     */
    private static final int MAG_2 = 2;
    /**
     * @author wasfy this is linked
     *
     */
    OurSingleLinked test = new OurSingleLinked();
    /**
     * @author wasfy this is linked
     *
     */
    ILinkedList sub;

    /**
     * @author wasfy this is test
     *
     */
    @Test
    public void add() {
        test.add(MAG_1); // 1
        test.add(MAG_0, MAG_5); // 5 1
        test.add(MAG_6); // 5 1 6
        test.add(MAG_3, MAG_6); // 5 1 6 6
        assertEquals(test.get(MAG_2), MAG_6);

    }
}
