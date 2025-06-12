class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int top = 0;
        int bottom = n-1;
        while(top < bottom){ //vertical traversel i.e,  
        //  [1, 2, 3],               [7, 8, 9],
        //  [4, 5, 6],     to        [4, 5, 6],
        //  [7, 8, 9]                [1, 2, 3]
            for(int col=0; col<n; col++){
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }
        //transpose the matix swapping [row][col] with [col][row] i.e,
        // [7, 8, 9]                  [7, 4, 1]
        // [4, 5, 6]       to         [8, 5, 2]
        // [1, 2, 3]                  [9, 6, 3]
        for(int row=0; row<n; row++){
            for(int col=row+1; col<n; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }
}