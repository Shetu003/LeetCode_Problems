class Solution {
    public boolean canJump(int[] nums) {
        int finalPos = nums.length - 1;
        for(int i= nums.length-2; i>=0; i--){
            if(finalPos <= i + nums[i]){
                finalPos = i;
            }
        }
        return finalPos == 0;
    }
}