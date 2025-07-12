class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1 = 0, cand2 = 0;
        int votes1 = 0, votes2 = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(cand1 == nums[i]){
                votes1++;
            }
            else if(cand2 == nums[i]){
                votes2++;
            }
            else if(votes1 == 0){
                cand1 = nums[i];
                votes1++;
            }
            else if(votes2 == 0){
                cand2 = nums[i];
                votes2++;
            }
            else{
                votes1--;
                votes2--;
            }
        }
        votes1 = 0;
        votes2 = 0;
        for(int i=0; i<n; i++){
            if(cand1 == nums[i]){
                votes1++;
            }
            else if(cand2 == nums[i]){
                votes2++;
            }
        }
        List<Integer> res = new ArrayList<>();
        if(votes1 > n/3){
            res.add(cand1);
        }
        if (votes2 > n / 3) {
            res.add(cand2);
        }
        return res;        
    }
}
