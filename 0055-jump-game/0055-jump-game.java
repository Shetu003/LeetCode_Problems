class Solution {
    public boolean canJump(int[] nums) {
        int finalPos = nums.length - 1; // Initialize finalPos as the last index (target)
        for (int i = nums.length - 2; i >= 0; i--) { // Iterate backwards from second last index to 0
            if (finalPos <= i + nums[i]) { // Check if we can jump from i to finalPos or beyond
                finalPos = i; // Update finalPos to current index i if reachable
            }
        }
        return finalPos == 0; // Return true if start index can reach the end, else false
    }
}

//greedy code
// class Solution {
//     public boolean canJump(int[] nums) {
//         int reach = 0;   // Initilize variable reach as 0, to store reach of the highest index.
//         for(int i=0;i<nums.length;i++){   // Iterate the nums and check if reach is smaller than i then return false else overwrite reach with max of reach and i+nums[i].
//             if(reach<i){
//                 return false;
//             }
//             reach = Math.max(reach,i+nums[i]);
//         }
//         return true;   // return true, beacause we reach the last value of the array nums.
//     }
// }