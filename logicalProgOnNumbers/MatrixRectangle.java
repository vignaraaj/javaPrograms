package logicalProgOnNumbers;

public class MatrixRectangle {
    public static void printRectangle(int[][] mat, int x1, int y1, int x2, int y2) {
        // Calculate the dimensions of the rectangle
        int numRows = Math.abs(x2 - x1) + 1;
        int numCols = Math.abs(y2 - y1) + 1;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) System.out.print(mat[x1 + i][y1 + j] + " ");
            System.out.println();
        }
        // Calculate and print the sum of the elements in the rectangle
        int sum = 0;
        for (int i = x1; i <= x2; i++) for (int j = y1; j <= y2; j++) sum += mat[i][j];
        System.out.println("sum " + sum);
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4}};
        int x1 = 2, y1 = 0, x2 = 3, y2 = 4;
        printRectangle(mat, x1, y1, x2, y2);
    }
}

