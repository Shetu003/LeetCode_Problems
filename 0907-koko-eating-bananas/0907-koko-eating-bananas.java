class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0; 
        for(int pile : piles){
            right = Math.max(right, pile); // find max pile
        }
        while(left < right){
            int mid = left + (right - left) / 2; // calculate mid speed

            if(canEatInTime(piles, h, mid)){ 
                right = mid; //if mid works then try lower speed
            }
            else{
                left = mid + 1; // try higher speed
            }
        }
        return left; // return minimum speed
    }

    public boolean canEatInTime(int piles[], int h, int speed){
        int hours = 0;
        for(int pile : piles){
            hours += Math.ceil((double)pile / (double)speed); // time per pile
        }
        return hours <= h; // check if within limit
    }
}
