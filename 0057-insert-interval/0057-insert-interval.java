class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        //left part (non-overlapping before newInterval)
        while(i < n && intervals[i][1] < newInterval[0]){ //if ending pt of ith intervals < starting pt of new interval
            res.add(intervals[i]);
            i++;
        }
        //overlapping part
        while(i < n && intervals[i][0] <= newInterval[1]){ //if starting pt of ith interval < ending pt of new interval
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        //right part (remaining)
        while(i < n){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}