class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);

        while (n != 1) { // Repeat until n becomes 1 (happy number)
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                n = n / 10;
                sum += digit * digit;
            }
            if (!set.add(sum))
                return false; // If sum already seen → cycle detected → not happy
            n = sum; // Update n to new sum for next iteration
        }
        return true;
    }
}
