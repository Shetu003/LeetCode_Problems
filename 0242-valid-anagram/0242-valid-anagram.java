class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        int count[] = new int[26];

        if(m != n) return false;

        for(int i=0; i<m; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}