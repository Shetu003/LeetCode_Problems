class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) { //twice array for circular traversal 
            int element = nums[i % n]; //to get the index of the doubled array elements

            while (!st.isEmpty() && st.peek() <= element) {
                st.pop(); //if top ele is smaller or equal then pop from stack
            }
            if(i < n){ //only fill the answer for origional array 
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