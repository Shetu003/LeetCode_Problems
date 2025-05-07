class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            if(set1.contains(num)){
                resSet.add(num);
            }
        }
        int [] result = new int[resSet.size()];
        int i=0;
        for(int num : resSet){
            result[i] = num;
            i++;
        }
        return result;
    }
}