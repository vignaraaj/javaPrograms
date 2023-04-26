package BacktrackingRecursion;

public class SudokuSolver {
    private int[][] grid;
    private int n;
    public SudokuSolver(int[][] sudoku){
        this.grid = sudoku;
        this.n=grid.length;
    }
    public boolean solveSudoku( int row, int col) {
        if (row == n-1 && col == n) return true;
        if (col == n) {
            row++;
            col = 0;
        }
        if (grid[row][col] != 0) return solveSudoku( row, col + 1);
        for (int num = 1; num < 10; num++) {
            if (isSafe(grid, row, col, num)) {
                grid[row][col] = num;
                if (solveSudoku( row, col + 1)) return true;
            }
            grid[row][col] = 0;
        }
        return false;
    }
    public void print(int[][] grid) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
    public boolean isSafe(int[][] grid, int row, int col, int num) {
        for (int x = 0; x < grid.length; x++) if (grid[row][x] == num) return false;
        for (int x = 0; x < grid[0].length; x++) if (grid[x][col] == num) return false;
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j + startCol] == num) return false;
        return true;
    }

    public static void main(String[] args) {
        int grid[][] = {{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }};
        SudokuSolver s = new SudokuSolver(grid);
        s.solveSudoku(0,0);
        s.print(grid);
    }
}
