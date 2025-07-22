class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        if (m < n) { //if haystack < needle then comaprision not possible 
            return -1;
        }
        for (int i = 0; i <= m - n; i++) { //slide over window of m-n
            if (haystack.substring(i, i + n).equals(needle)) { 
                return i; //return the start index
            }
        }
        return -1;
    }
}