class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean [][] vis = new boolean[m][n];

        int ans = 0;

        for (  int i=0 ; i<m ;++i)
            for (int j=0 ; j<n ; ++j)
                if (grid[i][j]==1 && (!vis[i][j])) {
                    
                    ans = Math.max(ans,dfs(i,j,m,n,vis,grid));
                }
        return ans;
    }

    public int dfs(int i , int j , int m, int n, boolean[][] vis , int[][] grid) {

        if(!(i>=0 && i<m && j>=0 && j<n) || vis[i][j] || grid[i][j] != 1) return 0;

        vis[i][j]=true;

        int ans =0;
        
        ans += dfs(i-1,j,m,n,vis,grid);
        ans += dfs(i+1,j,m,n,vis,grid);
        ans += dfs(i,j-1,m,n,vis,grid);
        ans += dfs(i,j+1,m,n,vis,grid);

        return ans+1;

    }
}