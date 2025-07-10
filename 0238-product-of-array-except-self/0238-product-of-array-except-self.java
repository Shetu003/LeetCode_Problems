class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            output[i] = 1; // Fill output array with 1s
        }

        int left = 1;
        for(int i = 0; i < nums.length; i++){
            output[i] *= left;      // Store current left product
            left *= nums[i];       // Update left product
        }

        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            output[i] *= right;     // Multiply with right product
            right *= nums[i];       // Update right product
        }
        return output;
    }
}
