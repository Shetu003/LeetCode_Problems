class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false; //false: -ve number are not power of two
        if (n == 1)
            return true; //true: 2^0 = 1 
        return (n % 2 == 0 && isPowerOfTwo(n / 2)); //to be the pow of 2 it will be divisible by 2 and also remainder will be 0
    }
}