public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;

        int m = matrix.length; // No of rows
        int n = matrix[0].length; // No of columns

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) { // Check for 0
                    if (i == 0)
                        firstRow = true; // First row has 0
                    if (j == 0)
                        firstCol = true; // First col has 0
                    matrix[i][0] = 0; // Mark row to be zeroed
                    matrix[0][j] = 0; // Mark column to be zeroed
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0; // Set entire row to 0
            }
        }

        if (firstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0; // Set entire column to 0
            }
        }
    }
}
