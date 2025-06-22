class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int max = 0;
        int left =  0;
        int res = 0;

        for(int right=0; right<s.length(); right++){
            arr[s.charAt(right) - 'A']++; //Increment frequency
             
            max = Math.max(max, arr[s.charAt(right) - 'A']);

            int windowSize = right - left + 1;
             
            if((windowSize - max) > k ){
                arr[s.charAt(left) - 'A']--; //Shrink window from left(decrement)
                left++;
            }
            res = Math.max(res, right - left + 1); 
        }
        return res;
    }
}