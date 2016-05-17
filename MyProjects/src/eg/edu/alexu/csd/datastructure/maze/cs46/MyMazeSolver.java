package eg.edu.alexu.csd.datastructure.maze.cs46;

import java.io.File;

import eg.edu.alexu.csd.datastructure.maze.IMazeSolver;

/**
 * @author wasfy this
 *
 */

public class MyMazeSolver implements IMazeSolver {
    /**
     * @author wasfy this
     *
     */

    ReadFileMaze reader = new ReadFileMaze();
    /**
     * @author wasfy this
     *
     */

    MazeBFS bf = new MazeBFS();
    /**
     * @author wasfy this
     *
     */

    MazeDFS df = new MazeDFS();
    /**
     * @author wasfy this
     *
     */

    char[][] array;
    /**
     * @author wasfy this
     *
     */

    int[][] answer;

    /**
     * @author wasfy this
     * @param maze
     * @return array
     *
     */

    @Override
    public int[][] solveBFS(final File maze) {
        // TODO Auto-generated method stub
        if (!maze.exists()) {
            throw new RuntimeException("file doesn't exist");
        }
        array = reader.ReadFile(maze);
        try {
            answer = bf.solve(array);
            if (answer == null) {
                return null;
            }
        } catch (Exception e) {
            if (!e.getMessage().equals("wrong maze")) {
                return null;
            }
            throw new RuntimeException("wrong maze");
        }
        return answer;
    }

    @Override
    /**
     * @author wasfy this
     * @param maze
     * @return array
     *
     */
    public int[][] solveDFS(final File maze) {
        // TODO Auto-generated method stub
        // String x = =maze;
        if (!maze.exists()) {
            throw new RuntimeException("file doesn't exist");
        }
        array = reader.ReadFile(maze);
        try {
            answer = df.solve(array);
            if (answer == null) {
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException("wrong maze");
        }
        return answer;
    }
}
//
