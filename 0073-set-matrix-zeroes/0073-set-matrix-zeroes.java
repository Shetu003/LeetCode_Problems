public class Solution {
    public void setZeroes(int[][] matrix) {

        boolean firstRow = false;     // Tracks if first row has 0
        boolean firstCol = false;     // Tracks if first col has 0

        int m = matrix.length;        // Number of rows
        int n = matrix[0].length;     // Number of columns

        // Step 1: Mark rows & cols that need to be zeroed
        for (int i = 0; i < m; i++) {               // Loop over all rows
            for (int j = 0; j < n; j++) {           // Loop over all columns
                if (matrix[i][j] == 0) {            // Check for 0
                    if (i == 0) firstRow = true;    // First row has 0
                    if (j == 0) firstCol = true;    // First col has 0
                    matrix[i][0] = 0;               // Mark row to be zeroed
                    matrix[0][j] = 0;               // Mark column to be zeroed
                }
            }
        }

        // Step 2: Set elements to 0 based on marks
        for (int i = 1; i < m; i++) {               // Skip first row
            for (int j = 1; j < n; j++) {           // Skip first column
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;               // Zero the cell
                }
            }
        }

        // Step 3: Zero first row if needed
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;                   // Set entire row to 0
            }
        }

        // Step 4: Zero first column if needed
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;                   // Set entire column to 0
            }
        }
    }
}
