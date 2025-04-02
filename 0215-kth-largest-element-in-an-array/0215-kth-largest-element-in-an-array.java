//using max priority queue 
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        int f = k-1;
        while(f>0){
            pq.poll();
            f--;
        }
        return pq.peek();        
    }
}
//using min priority queue
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

//         for (int i=0; i<nums.length; i++) {
//             minHeap.add(nums[i]);
//             if (minHeap.size() > k) {
//                 minHeap.poll();
//             }
//         }
//         return minHeap.peek();        
//     }
// }

// USING SORTING 

// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return nums[nums.length - k];        
//     }
// }
//using sorting
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return nums[nums.length - k];
//     }
// }