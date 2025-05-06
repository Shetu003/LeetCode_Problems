class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max_length=0;
        List<Character> list = new ArrayList<>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n=s.length();
//         int res=0;
//         int[] arr=new int[128];
//         for(int start=0,end=0;end<n;end++)
//         {
//             char ch=s.charAt(end);
//             start=Math.max(start,arr[ch]);
//             res=Math.max(res,end-start+1);
//             arr[ch]=end+1;
//         }
//         return res;
//     }
// }