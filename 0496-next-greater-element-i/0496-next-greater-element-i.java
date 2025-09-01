class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums2.length];
        Stack<Integer> st = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) { //iterate from right to left
            int element = nums2[i];

            while (!st.isEmpty() && st.peek() <= element) {
                st.pop(); //if top ele is smaller or equal then pop from stack
            }

            if (st.isEmpty()) { 
                ans[i] = -1; //if stack is empty then -1
            } else {
                ans[i] = st.peek(); //else not empty then top is the next greater ele
            }
            st.push(element);
        }

        Map<Integer, Integer> map = new HashMap<>();
        // Map to link each element of nums2 to its next greater element
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], ans[i]);
        }

        int[] finalAns = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            finalAns[i] = map.get(nums1[i]); //fetch from map 
        }
        return finalAns;
    }
}
