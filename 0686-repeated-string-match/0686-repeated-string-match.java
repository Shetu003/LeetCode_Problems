class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 1; //start with 1 copy of a 
        String temp = a; //temp for repeatition

        while (!a.contains(b)) { // Keep adding a until b is found in a
            a = a + temp;
            count++;

            if (a.length() > b.length() + 2 * temp.length()) { // If a gets too long and still doesn't have b, give up
                return -1;
            }
        }
        return count;
    }
}