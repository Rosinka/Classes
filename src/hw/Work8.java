package hw;

import java.util.Random;

/**
 * Created by lana on 04.06.17.
 */
public class Work8 {

    private static final int ROWS = 5;
    private static final int COLUMNS = 5;
    private static final int RANDOM_MAX_NUMBER = 5;

    public static void main(String[] args) {

        int[][] grid = gridRandom();
//        searchGridDigit(grid, 5);
//        copyPartGrid(grid, 1, 1, 3, 3);
//        System.out.println(mainDiagonalSum(grid));
//        System.out.println(secondDiagonalAverage(grid));
//        System.out.println(upperTriangleSum(grid));
//        printGrid(frequencyNumbers(grid));
//        maxGridNumber(grid);
//        secondDiagonalMax(grid);
    }

    public static int[][] gridRandom() {

        int[][] grid = new int[ROWS][COLUMNS];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
//                grid[i][j] = (int) (Math.random() * 10);
                grid[i][j] = new Random().nextInt(RANDOM_MAX_NUMBER);
            }
        }
        printGrid(grid);
        return grid;
    }

    private static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void searchGridDigit(int[][] grid, int searchDigit) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == searchDigit) {
                    System.out.println(searchDigit + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                }
            }
        }
    }

    public static void copyPartGrid(int[][] grid, int startRow, int startCol, int endRow, int endCol) {
        int[][] newGrid = new int[grid.length - startRow - endRow][grid[0].length - startCol - endCol];
        for (int i = startRow - 1; i <= endRow - 1; i++) {
            for (int j = startCol - 1; j <= endCol - 1; j++) {
                newGrid[i - startRow + 1][j - startCol + 1] = grid[i][j];
            }
        }
        System.out.println("-----------------");
        printGrid(newGrid);
    }

    public static int mainDiagonalSum(int[][] grid) {
        int sum = 0;
        for (int i = 0, j = 0; i < grid.length && j < grid[i].length; i++, j++) {
            sum += grid[i][j];
        }
        return sum;
    }

    public static double secondDiagonalAverage(int[][] grid) {
        double sum = 0, count = 0;
        for (int i = 0, j = grid[0].length - 1; i < grid.length && j >= 0; i++, j--) {
            sum += grid[i][j];
            count++;
        }
        return sum / count;
    }

    public static int upperTriangleSum(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i + j < grid.length - 1 && i - j < 0) {
                    sum += grid[i][j];
                    System.out.println(grid[i][j] + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
        return sum;
    }

    public static int[][] frequencyNumbers(int[][] grid) {

        int freq[][] = new int[ROWS * COLUMNS][2];
        for (int i = 0; i < grid.length; i++) {
            freq[i][0] = RANDOM_MAX_NUMBER + 1;
            freq[i][1] = 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                addFreqNumber(freq, grid[i][j]);
            }
        }
        return freq;
    }

    private static void addFreqNumber(int[][] freq, int value) {
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][0] == value) {
                freq[i][1]++;
                return;
            }
        }

        int index = 0;
        while (freq[index][0] != RANDOM_MAX_NUMBER + 1) {
            index++;
        }
        freq[index][0] = value;
        freq[index][1] = 1;
    }

    public static void maxGridNumber(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
        }
        System.out.println("Max number = " + max);
    }

    public static void secondDiagonalMax(int[][] grid) {
        int max = 0;
        for (int i = 0, j = grid[0].length - 1; i < grid.length && j >= 0; i++, j--) {
            if (grid[i][j] > max) {
                max = grid[i][j];
            }
        }
        System.out.println("Max number = " + max);
    }

}


