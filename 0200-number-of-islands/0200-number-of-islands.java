class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    search(grid,i,j);
                    islands++;
                }
            }
        }
        return islands;
    }
    private void search(char[][]grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0'; //mark as visited

        search(grid, i-1, j); //move up 
        search(grid, i+1, j); //move down
        search(grid, i, j-1); //move left
        search(grid, i, j+1); //move right
    }
}


// #Using BFS
// class Solution {
//     public int numIslands(char[][] grid) {
//         int islands = 0;
//         int m = grid.length;
//         int n = grid[0].length;
//         int [][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

//         Queue<int[]> q = new LinkedList<>();

//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 if(grid[i][j] == '1'){
//                     islands++;
//                     q.add(new int[]{i,j});
//                     grid[i][j] = '0'; //mark as visited

//                     while(!q.isEmpty()){
//                         int curr[] = q.poll();
//                         int x = curr[0];
//                         int y = curr[1];

//                         for(int [] dir : directions){
//                             int nx = x + dir[0];
//                             int ny = y + dir[1];
//                             if(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == '1'){
//                                 q.add(new int[]{nx, ny});
//                                 grid[nx][ny] = '0'; //mark as visited
//                             }
//                         }
//                     }
//                 }
//             }
//         }
//         return islands;
//     }
// }