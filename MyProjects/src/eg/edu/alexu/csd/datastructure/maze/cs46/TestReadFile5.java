package eg.edu.alexu.csd.datastructure.maze.cs46;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class TestReadFile5 {

    public static void main(String args[]) {

        String fileName = "D://test.txt";
        StringBuilder data = new StringBuilder();
        char[][] array;
        String[] strArray;
        int noRows;
        int noCol;

        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNext()) {
                data.append(scanner.nextLine());
                data.append(" ");

            }
            strArray = data.toString().split(" ");
            noRows = Integer.parseInt(strArray[0]);
            noCol = Integer.parseInt(strArray[1]);
            System.out.println(noRows);

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
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
