package eg.edu.alexu.csd.datastructure.iceHockey.cs46;

import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;

import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;

/**
 * @author wasfy this is test
 *
 */
public class MyIceHockey implements IPlayersFinder {

    /**
     * @author wasfy this is test
     *
     */
    int maxRow;

    /**
     * @author wasfy this is test
     *
     */
    int maxCol;

    /**
     * @author wasfy this is test
     *
     */
    int minCol;

    /**
     * @author wasfy this is test
     *
     */
    int minRow;

    /**
     * @author wasfy this is test
     *
     */
    char team;

    /**
     * @author wasfy this is test
     *
     */
    boolean[][] visited;

    /**
     * @author wasfy this is test
     *
     */
    String[] photo;

    /**
     * @author wasfy this is test
     *
     */
    int pointCounter;

    /**
     * @author wasfy this is test
     *
     */
    int length;

    /**
     * @author wasfy this is test
     *
     */
    Point[] firstarr;

    /**
     * @author wasfy this is test
     *
     */
    Point[] a = new Point[] {};

    /**
     * @author wasfy this is test
     *
     */
    Point[] arr;

    /**
     * @author wasfy this is test
     * @param photo
     *            test
     * @param team
     *            test
     * @param threshold
     *            test
     * @return test
     */
    /**
     * @author wasfy this is test
     *
     */
    private static final int MAG_1000 = 1000;
    /**
     * @author wasfy this is test
     *
     */
    private static final int MAG_3 = 3;
    /**
     * @author wasfy this is test
     *
     */
    private static final int MAG_4 = 4;
    /**
     * @author wasfy this is test
     *
     */
    private static final int MAG_5 = 5;
    /**
     * @author wasfy this is test
     *
     */
    private static final int MAG_6 = 6;
    /**
     * @author wasfy this is test
     *
     */
    private static final int MAG_7 = 7;
    /**
     * @author wasfy this is test
     *
     */
    private static final int MAG_8 = 8;
    /**
     * @author wasfy this is test
     *
     */
    private static final int MAG_9 = 9;
    /**
     * @author wasfy this is test
     *
     */
    private static final int MAG_10 = 10;
    /**
     * @author wasfy this is test
     *@param photo test
     *@param team test
     *@param threshold test
     *@return array
     */
    public Point[] findPlayers(final String[] photo, final int team,
            final int threshold) {
        // TODO Auto-generated method stub
        maxRow = 0;
        maxCol = 0;
        minCol = 0;
        minRow = 0;
        firstarr = new Point[MAG_1000];
        visited = new boolean[MAG_1000][MAG_1000];
        length = 0;
        pointCounter = 0;
        if (photo.length != 0) {
            this.photo = photo;
            switch (team) {
            case 0:
                this.team = '0';
                break;
            case 1:
                this.team = '1';
                break;
            case 2:
                this.team = '2';
                break;
            case MAG_3:
                this.team = '3';
                break;
            case MAG_4:
                this.team = '4';
                break;
            case MAG_5:
                this.team = '5';
                break;
            case MAG_6:
                this.team = '6';
                break;
            case MAG_7:
                this.team = '7';
                break;
            case MAG_8:
                this.team = '8';
                break;
            case MAG_9:
                this.team = '9';
                break;
            default:
                break;

            }
            try {
                for (int i = 0; i < photo.length; i++) {
                    for (int j = 0; j < photo[i].length(); j++) {
                        if (this.team == photo[i].charAt(j) && !visited[i][j]) {
                            length = 0;
                            maxRow = i;
                            maxCol = j;
                            minCol = j;
                            minRow = i;
                            findNext(i, j);

                            if (length * 4 >= threshold) {
                                firstarr[pointCounter] = new Point(
                                        maxCol + minCol + 1,
                                        maxRow + minRow + 1);

                                pointCounter++;

                            }
                        }

                    }
                }
            } catch (Exception e) {

            }
            if (pointCounter != 0) {
                arr = new Point[pointCounter];
                for (int i = 0; i < pointCounter; i++) {
                    arr[i] = firstarr[i];
                }
                sort(arr);
                return arr;
            } else {
                return a;
            }

        } else {
            return a;
        }
    }

    /**
     * @author wasfy this is test
     * @param row
     *            test
     * @param col
     *            test
     */
    public void findNext(final int row, final int col) {
        try {
            if (row < 0 || col < 0 || visited[row][col] || row >= photo.length
                    || col >= photo[0].length()
                    || this.team != photo[row].charAt(col)) {
                return;
            } else {

                visited[row][col] = true;
                length++;
                maxRow = Math.max(maxRow, row);
                maxCol = Math.max(maxCol, col);
                minCol = Math.min(minCol, col);
                minRow = Math.min(minRow, row);
                findNext(row + 1, col);
                findNext(row - 1, col);
                findNext(row, col + 1);
                findNext(row, col - 1);
                return;
            }
        } catch (Exception e) {

        }

    }

    /**
     * @author wasfy this is test
     * @param arr
     *            test
     */

    public void sort(final Point[] arr) {
        try {

            Arrays.sort(arr, new Comparator<Point>() {
                public int compare(final Point a, final Point b) {
                    int xComp = Integer.compare(a.x, b.x);
                    if (xComp == 0) {
                        return Integer.compare(a.y, b.y);
                    } else {
                        return xComp;
                    }
                }
            });
        } catch (Exception e) {

        }
    }

}
