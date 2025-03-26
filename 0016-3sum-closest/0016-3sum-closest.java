class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                if (currSum == target) {
                    return target;
                }

                if (currSum < target) {
                    left++;
                }
                else {
                    right--;
                }
                int diffToTarget = Math.abs(currSum - target);
                if(diffToTarget < minDiff){
                    result = currSum;
                    minDiff = diffToTarget;
                }
            }
        }
        return result;
    }
}