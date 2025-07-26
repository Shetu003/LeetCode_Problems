class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length];
        Stack<Integer> st = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            while (!st.isEmpty() && st.peek() <= element) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(element);
        }
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], ans[i]);
        }

        int[] finalAns = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            finalAns[i] = map.get(nums1[i]);
        }
        return finalAns;
    }
}
