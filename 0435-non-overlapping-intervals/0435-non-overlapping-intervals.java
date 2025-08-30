class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int LastEndTime = intervals[0][1]; // 0th index in array [0] and its ending time [1]
        int count = 1;

        for (int i = 0; i < n; i++) {
            if (intervals[i][0] >= LastEndTime) { // ith index in array and its start time > lastEnding time 
                LastEndTime = intervals[i][1];  
                count++;
            }
        }
        return n - count;
    }
}