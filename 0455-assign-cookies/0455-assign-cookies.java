class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;  // number of children
        int m = s.length;  // number of cookies

        Arrays.sort(g);    // sort children greed factors (ascending)
        Arrays.sort(s);    // sort cookies sizes (ascending)

        int i = 0, j = 0;  // i → index for cookies, j → index for children
        while(i < m && j < n){    // while there are cookies and children left
            if(g[j] <= s[i]){     // if cookie size >= child's greed
                j++;              // child is satisfied → move to next child
            }
            i++;                  // always move to next cookie
        }
        return j;   // number of satisfied children
    }
}
