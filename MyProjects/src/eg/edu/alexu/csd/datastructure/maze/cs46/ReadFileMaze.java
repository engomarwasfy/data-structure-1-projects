package eg.edu.alexu.csd.datastructure.maze.cs46;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author wasfy this
 *
 */
public class ReadFileMaze {
    /**
     * @author wasfy this
     * @param maze test
     *@return array test
     */
    public char[][] ReadFile(File maze) {

        StringBuilder data = new StringBuilder();
        char[][] array = null;
        String[] strArray;
        int noRows;
        int noCol;
        try (Scanner scanner = new Scanner(maze)) {

            while (scanner.hasNext()) {
                data.append(scanner.nextLine());
                data.append(" ");

            }
            strArray = data.toString().split(" ");
            noRows = Integer.parseInt(strArray[0]);
            noCol = Integer.parseInt(strArray[1]);
            if (noRows != strArray.length - 2) {
                throw new RuntimeException("no of rows error");
            }
            for (int i = 2; i < strArray.length; i++) {

                if (strArray[i].length() != noCol) {
                    throw new RuntimeException("no of cols error");

                }
            }
            array = new char[noRows][noCol];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    char ch = strArray[i + 2].charAt(j);
                    if (ch == 'S' || ch == 'E' || ch == '#' || ch == '.') {
                        array[i][j] = ch;
                    } else {

                        throw new RuntimeException("bad input");
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;

    }

}
