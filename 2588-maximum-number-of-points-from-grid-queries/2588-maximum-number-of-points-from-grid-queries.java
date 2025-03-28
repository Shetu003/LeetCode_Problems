class Solution {

    public int[] maxPoints(int[][] grid, int[] queries) {
        int n = grid.length;
        int m = grid[0].length;
        int k = queries.length;

        int[][] q = new int[queries.length][2];
        for(int i = 0;i<k;i++){
            q[i][0] = queries[i];
            q[i][1] = i;
        }
        Arrays.sort(q,(a,b)->a[0]-b[0]);
        
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        boolean[][] vis = new boolean[n][m];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        int[] res = new int[k];
        int maxpoints = 0;
        pq.offer(new int[]{0, 0, grid[0][0]});
        vis[0][0] = true;

        for (int i = 0; i < k; i++) {
            int val = q[i][0], indx = q[i][1];
            while(!pq.isEmpty() && pq.peek()[2]<val){
                int[] curr = pq.poll();
                int row = curr[0] ,col = curr[1] , currVal = curr[2];
                maxpoints++;
                for(int [] dir : directions){
                    int newRow = row+dir[0] ,newCol = col+dir[1];
                    if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && !vis[newRow][newCol]){
                        pq.offer(new int[]{newRow,newCol,grid[newRow][newCol]});
                        vis[newRow][newCol] = true;
                    }
                }
            }
            res[indx] = maxpoints;
        }
        return res;
    }
}