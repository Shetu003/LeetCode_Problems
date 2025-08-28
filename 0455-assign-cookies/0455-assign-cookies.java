class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;  // no of children
        int m = s.length;  // no of cookies

        Arrays.sort(g);    // sort children greed factors 
        Arrays.sort(s);    // sort cookies sizes 

        int i = 0, j = 0;  // i → index for cookies, j → index for children
        while(i < m && j < n){    
            if(g[j] <= s[i]){     // if cookie size >= child's greed
                j++;              // child is satisfied → move to next child
            }
            i++;                  // always move to next cookie
        }
        return j;   
    }
}
