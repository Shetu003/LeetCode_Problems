class Solution {
    class Pair{
        int x, y, t;
        Pair(int x, int y, int t){
            this.x = x;
            this.y = y;
            this.t = t;
        }
    }
    public int orangesRotting(int[][] grid) { //rottn=2, empty=0, fresh=1
        int m = grid.length; //row
        int n = grid[0].length; //col
        int cntFresh = 0;
        Queue<Pair> q = new LinkedList<>();
        int vis[][] = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0)); // push its location + time 0
                    vis[i][j] = 2; //mark it rotten
                }
                if(grid[i][j] == 1) cntFresh++; //inc fresh count 
            }
        }
        // Directions (up, right, down, left)
        int drow[] = {-1,0,+1,0}; 
        int dcol[] = {0,1,0,-1};
        int count = 0;
        int time = 0;

        while(!q.isEmpty()){
            Pair p = q.poll();
            int r = p.x;
            int c = p.y;
            int t = p.t;
            time = Math.max(time, t);

            for(int k=0; k<4; k++){
                int nr = r + drow[k];
                int nc = c + dcol[k];

                // check bounds + not visited + fresh orange
                if(nr >=0 && nr < m && nc >=0 && nc < n && vis[nr][nc] !=2 && grid[nr][nc] == 1){
                    q.add(new Pair(nr, nc, t + 1));
                    vis[nr][nc] = 2; //mark as rotten
                    count++;
                }
            }
        }
        if(count != cntFresh) return -1; //If not all fresh oranges were rotted
        return time;
    }
}