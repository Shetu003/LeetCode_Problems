class Solution {
    public int majorityElement(int[] nums) {
        int cand = nums[0];
        int votes = 0;

        for(int i=0; i<nums.length; i++){
            if(cand == nums[i]){
                votes++;
            }
            else if(votes == 0){
                cand = nums[i];
                votes++;
            }
            else{
                votes--;
            }
        }
        return cand;
    }
}