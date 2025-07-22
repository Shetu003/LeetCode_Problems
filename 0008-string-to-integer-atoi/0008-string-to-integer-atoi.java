class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // remove whitespace

        int sign = 1; // default sign is positive
        int i = 0;
        long res = 0;  
        
        // check for sign symbol
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }

        // convert digits to number
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break; // stop if not a digit

            res = res * 10 + (ch - '0'); // add digit to result

            // clamp to integer range
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * res); 
    }
}
