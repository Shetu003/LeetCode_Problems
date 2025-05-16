class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        long ans = 0;
        while(low <= high){
            long mid = low + (high - low) / 2;
            if(mid * mid == x){
                ans = (int)mid;
                break;
            }
            else if(mid * mid < x){
                low = mid + 1;
                ans = mid;
            }
            else{
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}
