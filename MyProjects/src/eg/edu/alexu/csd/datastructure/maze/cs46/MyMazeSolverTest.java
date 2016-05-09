package eg.edu.alexu.csd.datastructure.maze.cs46;

import java.io.File;

import eg.edu.alexu.csd.datastructure.maze.IMazeSolver;

public class MyMazeSolverTest {

    // @Override
    public int[][] solveBFS() {
        // TODO Auto-generated method stub
        MazeBFS help = new MazeBFS();
        char[][] array = new char[][]

        { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', 'S' } };
        return help.solve(array);

    }

    // @Override
    public int[][] solveDFS() {
        // TODO Auto-generated method stub
        // MazeDFS help = new MazeDFS();
        MazeDFS help = new MazeDFS();
        char[][] array = new char[][]

        {  
            {'#','.','.','.','S'},
            {'.','.','#','.','.'},
            {'#','#','#','.','.'},
            {'E','#','#','.','#'},
            {'.','#','.','.','#'}
         };
         try {
             return help.solve(array);
        } catch (Exception e) {
            // TODO: handle exception
           
           }
                
         return help.solve(array);
        
         
         
    }

}
