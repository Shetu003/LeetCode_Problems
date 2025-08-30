class Solution {
    public boolean canJump(int[] nums) {
        int maxTravel = 0;
        for(int i=0; i<nums.length; i++){
            if(i > maxTravel){
                return false;
            }
            maxTravel = Math.max(maxTravel, i + nums[i]);
        }
        return true;
    }
}

