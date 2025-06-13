class Solution {
    public String countAndSay(int n) {
        String result = "1"; // base case
        for (int i = 1; i < n; i++) { // generate next sequence
            result = describe(result); 
        }
        return result; 
    }

    private String describe(String s) {
        StringBuilder sb = new StringBuilder(); 
        int count = 1; // count chars 

        for (int i = 1; i < s.length(); i++) { 
            if (s.charAt(i) == s.charAt(i - 1)) {// same as previous
                count++; // increment count as encountered i.e, if "11" encounter then count = 2;
            } else {
                sb.append(count).append(s.charAt(i - 1)); // say and append i.e, for "11" it'll be "21" as 2 is count and 1 is the char encountered 
                count = 1; // reset count
            }
        }

        sb.append(count).append(s.charAt(s.length() - 1)); // handle last group
        return sb.toString(); 
    }
}
