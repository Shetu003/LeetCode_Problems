class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = leftBinarySearch(nums,target);
        int right = rightBinarySearch(nums,target);
        return new int[] {left,right};
    }
    private int leftBinarySearch(int nums[], int target){
        int index=-1, low=0, high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                index = mid;
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return index;
    }
    private int rightBinarySearch(int nums[], int target){
        int index=-1, low=0, high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                index = mid;
                low = mid+1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return index;
    }
}