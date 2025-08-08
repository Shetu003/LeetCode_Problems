public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;

        int m = matrix.length; //no of rows
        int n = matrix[0].length; //no of col

        for(int i=0; i<m; i++){ //Identify the rows and columns that should be zeroed
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){ 
                    if(i == 0){ //if zero found in 1st row
                        firstRow = true;
                    }
                    if(j == 0){ //if zero found in 1st col
                        firstCol = true;
                    }
                    matrix[i][0] = 0; // Mark the first element of the row as zero
                    matrix[0][j] = 0; // Mark the first element of the column as zero
                }
            }
        }

        for(int i=1; i<m; i++){ //if zero found in row or col then set the appropriate cells to zero
            for(int j=1; j<n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstCol){ //zero out 1st col 
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }

        if(firstRow){ //zero out 1st row
            for(int j=0; j<n; j++){
                matrix[0][j] = 0;
            }
        }
    }
}
