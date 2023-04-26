package logicalProgOnNumbers;

import java.lang.*;
public class MatrixRotation {
    static void rotateMatrix(int bottom, int right, int mat[][]) {
        int top = 0, left = 0;
        int prev, curr;
        while (top < bottom && left < right) {
            if (top + 1 == bottom || left + 1 == right) break; // Store the first element of next top, this element will replace first element of current top
            prev = mat[top + 1][left]; // Move elements of first top from the remaining tops
            for (int i = left; i < right; i++) {
                curr = mat[top][i];
                mat[top][i] = prev;
                prev = curr;
            }
            top++; // Move elements of last left from the remaining left
            for (int i = top; i < bottom; i++) {
                curr = mat[i][right-1];
                mat[i][right-1] = prev;
                prev = curr;
            }
            right--; // Move elements of last top from the remaining tops
            if (top < bottom) {
                for (int i = right-1; i >= left; i--) {
                    curr = mat[bottom-1][i];
                    mat[bottom-1][i] = prev;
                    prev = curr;
                }
            }
            bottom--;
            // Move elements of first left from the remaining tops
            if (left < right) {
                for (int i = bottom-1; i >= top; i--) {
                    curr = mat[i][left];
                    mat[i][left] = prev;
                    prev = curr;
                }
            }
            left++;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) System.out.print( mat[i][j] + " ");
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int a[][] = { {1, 2,3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };
//      int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        rotateMatrix(a.length, a[0].length, a);
    }
}
