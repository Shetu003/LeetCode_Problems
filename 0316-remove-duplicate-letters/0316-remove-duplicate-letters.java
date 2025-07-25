class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26]; //tracks last index of the characters
        for(int i=0; i<s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            int curr = s.charAt(i) - 'a';
            if(seen[curr]){
                continue; //is already present then skip
            } 
            while(!st.empty() && st.peek()> curr && i < lastIndex[st.peek()]){ //pop out and mark unseen
                int ele = st.pop();
                seen[ele] = false;
            }
            st.push(curr); //if not all these then push and mark as seen
            seen[curr] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append((char) (st.pop() + 'a')); // ex: (char)(c(2) + 'a')  // 'a' has ASCII 97 → 97 + 2 = 99 → (char)99 = 'c'
        }

        return sb.reverse().toString();
    }
}