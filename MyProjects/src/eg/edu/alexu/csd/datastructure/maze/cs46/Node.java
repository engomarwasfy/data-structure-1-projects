package eg.edu.alexu.csd.datastructure.maze.cs46;

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
     * @param y
     *            test @ param parent test
     */

    Node(int x, int y, Node Parent) {
        this.x = x;
        this.y = y;
        this.Parent = Parent;
    }

}
