package eg.edu.alexu.csd.datastructure.maze.cs46;

public class Node {

    int x;
    int y;
    Node Parent;

    Node(int x, int y, Node Parent) {
        this.x = x;
        this.y = y;
        this.Parent = Parent;
    }

}
