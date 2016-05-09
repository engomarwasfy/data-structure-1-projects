package eg.edu.alexu.csd.datastructure.maze.cs46;

import java.io.File;

import eg.edu.alexu.csd.datastructure.maze.IMazeSolver;

public class MyMazeSolver implements IMazeSolver {
    ReadFileMaze reader = new ReadFileMaze();
    MazeBFS bf = new MazeBFS();
    MazeDFS df = new MazeDFS();
    char [][] array ;
    int [][]answer ;

    @Override
    public int[][] solveBFS(File maze) {
        // TODO Auto-generated method stub
        if(!maze.exists()){
            throw new RuntimeException("file doesn't exist");
        }
        array = reader.ReadFile(maze);
        try {
            answer= bf.solve(array);
            if (answer == null){
                return null;
            }       
        } catch (Exception e) {
            // TODO: handle exception
            if (!e.getMessage().equals("wrong maze")){
                return null;
            }
            throw new RuntimeException("wrong maze");
        }
        return answer;
        }
    @Override
    public int[][] solveDFS(File maze) {
        // TODO Auto-generated method stub
        // String x = =maze;
        if(!maze.exists()){
            throw new RuntimeException("file doesn't exist");
        }
        array = reader.ReadFile(maze);
        try {
            answer= df.solve(array);
            if (answer == null){
                return null;
            }       
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException("wrong maze");
        }
        return answer;
    }
    }


