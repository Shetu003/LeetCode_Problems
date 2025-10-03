class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> st = new Stack<>();

        for(String part : parts){
            if(part.equals("") || part.equals(".")){
                continue;
            }
            else if(part.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(part);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String dir : st){
            sb.append("/").append(dir);
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }
}