class Solution{
    public void reverseString(char[]s){
        int left=0,right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}

// class Solution {
//     public void reverseString(char[] s) {
//         StringBuilder sb = new StringBuilder(new String(s)).reverse();
//         for(int i=0; i<s.length; i++){
//             s[i] = sb.charAt(i);
//         }
//     }
// }