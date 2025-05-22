class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n - 1; i >= 0; i--) {
            // If digit less than 9, increment and return result immediately
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, set it to 0 
            digits[i] = 0;
        }

        // If all digits were 9, result will have one more digit (e.g., 999 + 1 = 1000)
        int[] newNo = new int[n + 1];
        newNo[0] = 1; // Set first digit to 1 and rest default 0
        return newNo;
    }
}
