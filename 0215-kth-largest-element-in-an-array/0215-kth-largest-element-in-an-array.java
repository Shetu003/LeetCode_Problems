//using max priority queue 
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        //add all element to the heap
        for(int num : nums){
            pq.add(num);
        }
        
        //remove largest element (k-1) times
        for(int i=1; i<k; i++){
            pq.poll();
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