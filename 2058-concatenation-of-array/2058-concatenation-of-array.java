class Solution {
    public int[] getConcatenation(int[] nums) {
        int answer[] = new int[nums.length * 2];
        for(int i=0; i<nums.length; i++){
            answer[i] = nums[i];
        }
        int index = nums.length;
        for(int i=0; i<nums.length; i++){
            answer[index] = nums[i];
            index++;
        }
        return answer;
    }
}