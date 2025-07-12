class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){ //if already in set, it's a duplicate
                return nums[i]; //return the duplicate number 
            }
            else{
                set.add(nums[i]);
            }
        }
        return -1;
    }
}



// class Solution {
//     public int findDuplicate(int[] nums) {
//         int slow=0;
//         int fast=0;
//         do{
//             slow=nums[slow];
//             fast=nums[nums[fast]];
//         }while(slow!=fast);
//         slow=0;
//         while(slow!=fast){
//             slow=nums[slow];
//             fast=nums[fast];
//         }
//         return slow;
//     }
// }