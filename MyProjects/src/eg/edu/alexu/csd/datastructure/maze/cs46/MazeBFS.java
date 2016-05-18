package eg.edu.alexu.csd.datastructure.maze.cs46;

import eg.edu.alexu.csd.datastructure.queue.cs46.MyQueueLinked;
import eg.edu.alexu.csd.datastructure.stack.cs46.MyStack;

/**
 * @author wasfy this
 *
 */
public class MazeBFS {
    /**
     * @author wasfy this
     *
     */
    private static final int MAG = 1000;
    /**
     * @author wasfy this
     *
     */
    Node current;
    /**
     * @author wasfy this
     *
     */
    boolean[][] visited = new boolean[MAG][MAG];
    /**
     * @author wasfy this
     *
     */
    int[][] Answer;
    /**
     * @author wasfy this
     *
     */
    MyStack s = new MyStack();
    /**
     * @author wasfy this
     *
     */
    MyQueueLinked q = new MyQueueLinked();
    // x is row order
    // y is col order
    /**
     * @author wasfy this
     *
     */
    boolean Start;
    /**
     * @author wasfy this
     *
     */
    boolean End;

    /**
     * @author wasfy this
     * @param array
     *            test
     * @return test
     *
     */
    public int[][] solve(final char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 'S') {
                    current = new Node(i, j, null);
                    visited[i][j] = true;
                    Start = true;
                } else if (array[i][j] == 'E') {
                    End = true;
                }

            }

        }
        if (!(Start && End)) {
            throw new RuntimeException("wrong maze");

        }
        try {
            while (array[current.x][current.y] != 'E') {
                // North Heading
                // System.out.println(current.x + "," + current.y);
                if (current.x - 1 >= 0 && array[current.x - 1][current.y] != '#'
                        && !visited[current.x - 1][current.y]) {
                    q.enqueue((new Node(current.x - 1, current.y, current)));
                    visited[current.x - 1][current.y] = true;
                }
                // east Heading
                if (current.y + 1 < array[0].length
                        && array[current.x][current.y + 1] != '#'
                        && !visited[current.x][current.y + 1]) {

                    q.enqueue((new Node(current.x, current.y + 1, current)));
                    visited[current.x][current.y + 1] = true;

                }
                // South Heading
                if (current.x + 1 < array.length
                        && array[current.x + 1][current.y] != '#'
                        && !visited[current.x + 1][current.y]) {
                    q.enqueue((new Node(current.x + 1, current.y, current)));
                    visited[current.x + 1][current.y] = true;
                }
                // west Heading
                if (current.y - 1 >= 0 && array[current.x][current.y - 1] != '#'
                        && !visited[current.x][current.y - 1]) {
                    q.enqueue((new Node(current.x, current.y - 1, current)));
                    visited[current.x][current.y - 1] = true;
                }
                visited[current.x][current.y] = true;
                current = (Node) q.dequeue();
            }
        } catch (Exception e) {
            return null;
        }

        Node e = current;
        while (e != null) {
            // System.out.println(e.x + ",," + e.y);
            s.push(e);
            e = e.Parent;
        }
        int count = 0;
        Answer = new int[s.size()][2];
        while (!s.isEmpty()) {
            Node ob = (Node) s.pop();

            Answer[count][0] = ob.x;
            Answer[count][1] = ob.y;
            count++;
        }
        return Answer;
    }
}
//
