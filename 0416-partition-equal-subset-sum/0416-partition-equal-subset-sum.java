class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0, n = nums.length;
        for(int i=0; i<n; i++){
            total += nums[i];
        }
        if(total % 2 != 0) return false;
        int target = total/2;
        boolean []dp = new boolean[target+1];
        dp[0] = true;

        for(int num : nums){
            for(int i=target; i>=num; i--){
                dp[i] = dp[i] || dp[i-num];
            }
        }
        return dp[target];
    }
}