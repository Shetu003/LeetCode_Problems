class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 1;
        String temp = a;

        while (!a.contains(b)) {
            a = a + temp;
            count++;

            if (a.length() > b.length() + 2 * temp.length()) {
                return -1;
            }
        }
        return count;
    }
}