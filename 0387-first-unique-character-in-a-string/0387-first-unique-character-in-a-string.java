class Solution {
    public int firstUniqChar(String s) {
        int [] freq = new int[26];
        //count freq of each char 
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a'] == 1){ //counting by using ASCII values
                return i;
            }
        }
        return -1;
    }
}