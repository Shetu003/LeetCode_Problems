class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int element = nums[i % n];

            while (!st.isEmpty() && st.peek() <= element) {
                st.pop();
            }
            if(i < n){
                if (st.isEmpty()) {
                    ans[i] = -1; //if stack is empty then -1
                } else {
                    ans[i] = st.peek(); //else not empty then top is the next greater ele
                }
            }
            st.push(element);
        }
        return ans;
    }
}