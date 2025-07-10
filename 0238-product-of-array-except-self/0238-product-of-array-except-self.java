class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            output[i] = 1;
        }

        int left = 1;
        for(int i=0; i<nums.length; i++){
            output[i] *= left;
            left *= nums[i];
        }

        int right=1;
        for(int i=nums.length-1; i>=0; i--){
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }
}



// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int left[] = new int[nums.length];
//         int right[] = new int[nums.length];

//         left[0] = 1; //starting from index 1 
//         for(int i=1; i<nums.length; i++){
//             left[i] = left[i-1] * nums[i-1];
//         }

//         right[nums.length-1] = 1; //starting from the 2nd last index
//         for(int i=nums.length-2; i>-1; i--){
//             right[i] = right[i+1] * nums[i+1];
//         }

//         int ans[] = new int[nums.length];  //store the answer in new array 
//         for(int i=0; i<nums.length; i++){
//             ans[i] = left[i] * right[i];
//         }
//         return ans;
//     }
// }

