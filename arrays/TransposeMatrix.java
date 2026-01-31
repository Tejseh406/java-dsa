package arrays;

import static arrays.RotateMatrix.printMatrix;

public class TransposeMatrix {
     public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposedMatrix = transpose(matrix);
        printMatrix(transposedMatrix);
    }

    // works for non-square matrices as well
    // Time Complexity: O(m*n), Space Complexity: O(m*n)
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }   
        }
        return transposed;
    }

    // works only for square matrices
    // Time Complexity: O(n^2), Space Complexity: O(1)
    public static void transposeInPlace(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
