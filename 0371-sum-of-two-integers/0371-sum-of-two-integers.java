class Solution {
    public int getSum(int a, int b) {
        while(b != 0){ 
            int carry = (a & b) << 1; //AND finds positions where both bits are 1 , << Shifts carry bits one position left, because carry affects the next higher bit.
            a = a^b; //XOR adds bits without carrying.
            b = carry;
        }
        return a;
    }
}