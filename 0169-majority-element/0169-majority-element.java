//Moore's Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int cand = nums[0];
        int votes = 0;

        for(int i=0; i<nums.length; i++){
            if(votes == 0){
                cand = nums[i];
                votes++;
            }
            else if(cand == nums[i]){
                votes++;
            }
            else{
                votes--;
            }
        }
        return cand;
    }
}

// class Solution {
//     public int majorityElement(int[] nums) {
//         int cand=0;
//         int count=0;
//         for(int i=0; i<nums.length; i++){
//             if(count==0){
//                 cand = nums[i];
//             }
//             if(cand == nums[i]){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//         }
//         return cand;
//     }
// }