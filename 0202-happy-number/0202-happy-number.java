class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n!=1){
            int sum=0;
            while(n>0){
                int digit = n%10;
                n/=10;
                sum+=digit*digit;
            }

            if(!set.add(sum)) return false;
            n=sum;
        }
        return true;
    }
}