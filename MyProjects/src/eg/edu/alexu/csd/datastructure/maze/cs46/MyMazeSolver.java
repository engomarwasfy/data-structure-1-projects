package eg.edu.alexu.csd.datastructure.maze.cs46;

import java.io.File;

import eg.edu.alexu.csd.datastructure.maze.IMazeSolver;

public class MyMazeSolver implements IMazeSolver {
    ReadFileMaze reader = new ReadFileMaze();
    char[][] array;

    @Override
    public int[][] solveBFS(File maze) {
        // TODO Auto-generated method stub
        array = reader.ReadFile(maze);

        return null;
    }

    @Override
    public int[][] solveDFS(File maze) {
        // TODO Auto-generated method stub
        // String x = =maze;
        array = reader.ReadFile(maze);
        return null;
    }

}
