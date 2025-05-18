class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;

        if (n % 2 == 1) //If n is odd, reduce the power by 1 to make it even, and multiply x once.
            return x * myPow(x, n - 1);

        if (n % 2 == 0) //If n is even, use exponentiation by squaring
            return myPow(x * x, n / 2);

        return 1 / myPow(x, -n); //This handles negative exponents
    }
}
// TC: O(logn), SC: O(1)