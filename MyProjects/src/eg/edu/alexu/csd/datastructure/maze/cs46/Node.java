package eg.edu.alexu.csd.datastructure.maze.cs46;
/**
 * @author wasfy this
 *
 */
public class Node {
    /**
     * @author wasfy this
     *
     */
    int x;
    /**
     * @author wasfy this
     *
     */
    int y;
    /**
     * @author wasfy this
     *
     */
    Node Parent;

    /**
     * @author wasfy this
     * @param x
     *            test
     * @param y test
     *@param Parent test
     */

    Node(final int x, final int y, final Node Parent) {
        this.x = x;
        this.y = y;
        this.Parent = Parent;
    }

}
