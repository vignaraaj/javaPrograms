package BacktrackingRecursion;

public class NumberOfIslands {
    //recursiveApproach
    public int findIslands(char[][] matrix) {
        int h = matrix.length;
        if (h == 0) return 0;
        int l = matrix[0].length;
        int result = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (matrix[i][j] == '1') {
                    dfs(matrix, i,  j);
                    result++;
                }
            }
        }
        return result;
    }
    public void dfs(char[][] matrix, int row, int col) {
        int H = matrix.length;
        int L = matrix[0].length;
        if (row < 0 || col < 0 || row >= H || col >= L || matrix[row][col] != '1') return;
        matrix[row][col] = '0'; //marking this element as visited
        dfs(matrix, row+ 1, col);
        dfs(matrix, row- 1, col);
        dfs(matrix, row, col + 1);
        dfs(matrix, row, col - 1);
        dfs(matrix,row-1,col+1);
        dfs(matrix,row-1,col-1);
        dfs(matrix,row+1,col+1);
        dfs(matrix,row+1,col-1);

    }
    public static void main(String args[]) {
        NumberOfIslands i= new NumberOfIslands();
        //includes corner boundaries too
        char[][] islandGrid = new char[][]{{'1', '1', '0', '0', '0'},
                                            {'0', '1', '0', '0', '1'},
                                            {'1', '0', '0', '1', '1'},
                                            {'0', '0', '0', '0', '0'},
                                            {'1', '0', '1', '0', '1'}};
        System.out.println("Number of Islands: " + i.findIslands(islandGrid));
    }
}
