class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE; // smallest number so far
        int j = Integer.MAX_VALUE; // second smallest so far
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] <= i) {      // found new smallest
                i = nums[idx];
            }
            else if (nums[idx] <= j) { // found number > i but smaller than j
                j = nums[idx];
            }
            else {                     // found number > j → triplet exists
                return true;
            }
        }
        return false; // no triplet found
    }
}
