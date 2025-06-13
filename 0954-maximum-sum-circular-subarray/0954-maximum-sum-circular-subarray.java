//Observation : finad totalSum and minSum, then find circularSum = totalSum - minSum and at the end comapre the circullaarSum with the max sum
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMaxSum = 0;
        int currMinSum = 0;
        int maxSum = Integer.MIN_VALUE; //-inf
        int minSum = Integer.MAX_VALUE; //+inf

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
            currMinSum = Math.min(currMinSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMaxSum);
            minSum = Math.min(minSum, currMinSum);
        }
        if (maxSum < 0) {
            return maxSum;
        } else {
            return Math.max(maxSum, totalSum - minSum);
        }
    }
}
