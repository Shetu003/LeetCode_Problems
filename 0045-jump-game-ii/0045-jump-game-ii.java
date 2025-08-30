class Solution {
    public int jump(int[] nums) {
        int jumps = 0, left = 0, right = 0;

        while(right < nums.length-1){
            int farthest = 0;
            // Only iterate within the current window
            for(int i=left; i<=right; i++){
                farthest = Math.max(farthest, i+nums[i]);
            }
            left = right + 1; // update left
            right = farthest; // update right
            jumps++; //increment jump at each range/window
        }
        return jumps;
    }
}