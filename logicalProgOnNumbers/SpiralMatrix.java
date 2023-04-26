package logicalProgOnNumbers;

public class SpiralMatrix {
    public static void main(String[] args) {
        printSpiralMatrix1();
        printSpiralMatrix2(5);
    }
    static void printSpiralMatrix1() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 5},
                {7, 8, 9, 6},
        };
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(left<=right && top<=bottom){
            for (int i = left; i <= right; i++) System.out.print(matrix[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(matrix[i][right] + " ");
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
        System.out.println();
    }
    static void printSpiralMatrix2(int n){
        int size =n*2-1;
        int top = 0;
        int bottom = size - 1;
        int left = 0;
        int right = size - 1;
        int[][] matrix = new int[size][size];
        while(left<=right && top<=bottom && n>0){
            for (int i = left; i <= right; i++) matrix[top][i]=n;
            top++;
            for (int i = top; i <= bottom; i++) matrix[i][right]=n;
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) matrix[bottom][i]=n;
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) matrix[i][left]=n;
                left++;
            }
            n-=1;
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++) System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
}
