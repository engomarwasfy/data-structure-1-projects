package eg.edu.alexu.csd.datastructure.maze.cs46;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyMazeSolverTest S = new MyMazeSolverTest();
        int[][] a;
       // a = S.solveBFS();
         a = S.solveDFS();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }
    }

}
