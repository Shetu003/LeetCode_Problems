class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        HashSet<Integer> set = new HashSet<>(); 
        for(int[] t: triplets){
            //Skipping the triplets that exceeds the target
            if(t[0] > target[0] || t[1] > target[1] || t[2] > target[2]){
                continue;
            }
            for(int i=0;i<t.length;i++){
                if(t[i]==target[i]) set.add(i);
            }
        }
        //if our set size is 3, means we got our target in triplets array so return true else return false
        return set.size() == 3;
    }
}