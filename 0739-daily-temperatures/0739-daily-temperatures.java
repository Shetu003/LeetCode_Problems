class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>(); 
        int result[] = new int[temperatures.length]; 

        for (int i = 0; i < temperatures.length; i++) {
            // while stack isn't empty and current element > element at top of stack
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int idx = st.pop(); // pop index
                result[idx] = i - idx; // days waited
            }
            st.push(i); // push current index
        }
        return result; 
    }
}
