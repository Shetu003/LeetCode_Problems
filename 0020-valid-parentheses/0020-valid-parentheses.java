class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(')');
            }
            else if(c == '{'){
                st.push('}');
            }
            else if(c == '['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop()!=c ){
                return false;
            }
        }
        return st.isEmpty();
    }
}


// class Solution {
//     public boolean isValid(String s) {
//         char arr[] = s.toCharArray();
//         Stack<Character> stack = new Stack<>();
//         for(char ch : arr){
//             if(stack.isEmpty()){
//                 stack.push(ch);
//             }
//             else{
//                 char top = stack.peek();
//                 if(ch - top == 1 || ch - top == 2){
//                     stack.pop();
//                 } else{
//                     stack.push(ch);
//                 }
//             }
//         }
//         return stack.isEmpty();
//     }
// }
