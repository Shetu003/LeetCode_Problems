class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;  // no of children
        int m = s.length;  // no of cookies

        Arrays.sort(g);    // sort children greed factors 
        Arrays.sort(s);    // sort cookies sizes 

        int i = 0, j = 0;  // i → index for children, j → index for cookies
        while(i < n && j < m){    
            if(g[i] <= s[j]){     // if cookie size >= child's greed
                i++;              // child is satisfied → move to next child
            }
            j++;                  // always move to next cookie
        }
        return i;   
    }
}
