class Solution {
    public int jump(int[] nums) {
        int totaljumps=0,covrage=0,lastjump=0;
        if(nums.length==1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            covrage = Math.max(covrage,i+nums[i]);
            if(i==lastjump){
                lastjump=covrage;
                totaljumps++;
                if(covrage>=nums.length-1){
                    return totaljumps;
                }
            }
        }
        return -1;
    }
}