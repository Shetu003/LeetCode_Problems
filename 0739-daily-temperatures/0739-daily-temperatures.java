class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int result[] = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int idx = st.pop();
                result[idx] = i - idx;
            }
            st.push(i);
        }
        return result;
    }
}