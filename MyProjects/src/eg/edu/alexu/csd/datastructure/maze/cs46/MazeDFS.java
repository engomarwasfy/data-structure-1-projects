package eg.edu.alexu.csd.datastructure.maze.cs46;

import eg.edu.alexu.csd.datastructure.stack.cs46.MyStack;

/**
 * @author wasfy this
 *
 */
public class MazeDFS {
    /**
     * @author wasfy this
     *
     */
    Node current;
    /**
     * @author wasfy this
     *
     */
    boolean[][] visited = new boolean[1000][1000];
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
            s.push(new Node(current.x, current.y, null));

            while (array[current.x][current.y] != 'E') {
                // North Heading
                visited[current.x][current.y] = true;
                // System.out.println(current.x+","+current.y);
                if (current.x - 1 >= 0 && array[current.x - 1][current.y] != '#'
                        && !visited[current.x - 1][current.y]) {
                    s.push(new Node(current.x - 1, current.y, (Node) s.peek()));
                    // System.out.println(
                    // ((Node) s.peek()).x + "," + ((Node) s.peek()).y
                    // +"North");

                    visited[current.x - 1][current.y] = true;
                    current = (Node) s.peek();
                }
                // east Heading
                else if (current.y + 1 < array[0].length
                        && array[current.x][current.y + 1] != '#'
                        && !visited[current.x][current.y + 1]) {

                    s.push(new Node(current.x, current.y + 1, (Node) s.peek()));
                    // System.out.println(
                    // ((Node) s.peek()).x + "," + ((Node) s.peek()).y+"east");

                    visited[current.x][current.y + 1] = true;
                    current = (Node) s.peek();
                }
                // South Heading
                else if (current.x + 1 < array.length
                        && array[current.x + 1][current.y] != '#'
                        && !visited[current.x + 1][current.y]) {
                    s.push(new Node(current.x + 1, current.y, (Node) s.peek()));
                    // System.out.println(
                    // ((Node) s.peek()).x + "," + ((Node) s.peek()).y+"south");

                    visited[current.x + 1][current.y] = true;
                    current = (Node) s.peek();
                }
                // west Heading
                else if (current.y - 1 >= 0
                        && array[current.x][current.y - 1] != '#'
                        && !visited[current.x][current.y - 1]) {
                    s.push(new Node(current.x, current.y - 1, (Node) s.peek()));
                    // System.out.println(
                    // ((Node) s.peek()).x + "," + ((Node) s.peek()).y+"west");

                    visited[current.x][current.y - 1] = true;
                    current = (Node) s.peek();
                } else {
                    visited[current.x][current.y] = true;
                    Node e = (Node) s.pop();
                    // System.out.println(e.x+","+e.y+"POPED");

                    current = (Node) s.peek();

                    // current = ((Node)s.pop()).Parent;
                }
            }
        } catch (Exception e) {
            return null;
        }

        Node e = (Node) s.peek();
        Answer = new int[s.size()][2];
        for (int i = s.size() - 1; i >= 0; i--) {
            Node t = (Node) s.pop();
            Answer[i][0] = t.x;
            Answer[i][1] = t.y;
        }
        return Answer;
    }
}

//
