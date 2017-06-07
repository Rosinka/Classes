package hw;

/**
 * Created by lana on 04.06.17.
 */
public class Work8 {
    public static void main(String[] args) {
        int[][] grid = gridRandom(7, 7);
//        searchGridDigit(grid, 5);
        copyPartGrid(grid, 1, 1, 3, 3);
//        System.out.println(mainDiagonalSum(grid));
//        System.out.println(secondDiagonalAverage(grid));
//        upperTriangleSum(grid);
    }

    public static int[][] gridRandom(int rows, int columns) {
        int[][] grid = new int[rows][columns];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = (int) (Math.random() * 10);
            }
        }
        printGrid(grid, grid.length, grid[0].length);
        return grid;
    }

    private static void printGrid(int[][] grid, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
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
        printGrid(newGrid, newGrid.length, newGrid[0].length);
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

    public static void upperTriangleSum(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i + j < grid.length - 1 && i - j < 0) {
                    System.out.println(grid[i][j] + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
    }

}


