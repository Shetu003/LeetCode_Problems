class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int hindex = 0;
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                hindex = h;
                break;
            }
        }
        return hindex;
    }
}