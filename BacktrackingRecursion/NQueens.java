package BacktrackingRecursion;

public class NQueens {
    public static void main(String[] args) {
        int length = 8;
        NQueens n = new NQueens();
        int[][] board = new int[length][length];
        for (int i = 0; i < length; i++) for (int j = 0; j < length; j++) board[i][j] = 0;
        n.nQueensSolver(board,0);
    }
    public boolean nQueensSolver(int[][] board,int col) {
        int n = board.length;
        if (col >= n) {
            printBoard(board);
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (canPlace(board, i, col)) {
                board[i][col] = 1;
                if (nQueensSolver(board, col + 1)) return true;
                board[i][col] = 0;
            }
        }
        return false;
    }
    static boolean canPlace(int board[][],int row,int col) {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1) return false;
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)//upper left diagonal
            if (board[i][j] == 1) return false;
        for (i = row, j = col; j >= 0 && i < board.length; i++, j--)//lower right diagonal
            if (board[i][j] == 1) return false;
        return true;
    }
    static void printBoard(int[][] board){
        int n = board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }
}
