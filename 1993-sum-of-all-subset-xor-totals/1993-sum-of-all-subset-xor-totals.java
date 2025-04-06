class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length; // Number of elements in nums
        int sum = 0;
        for (int num : nums) { // Bitwise OR all elements
            sum |= num;
        }
        return sum * (1 << (n - 1)); // Multiply OR-result with 2^(n-1)
    }
}