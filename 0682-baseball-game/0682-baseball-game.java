class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String ops : operations){
            if(ops.equals("+")){
                int a = st.pop();    // Last score
                int b = st.peek();   // Second last score
                st.push(a);          // Push back the last score
                st.push(a + b);      // Push their sum
            }
            else if(ops.equals("D")) st.push(st.peek() * 2);    // Double the last score
            else if(ops.equals("C")) st.pop();                  //remove last score 
            else st.push(Integer.valueOf(ops));
        }
        int sum=0;
        while(!st.isEmpty()){       // Add up all the scores to get result
            sum += st.pop();
        }
        return sum;
    }
}