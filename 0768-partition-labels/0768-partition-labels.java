class Solution {
    public List<Integer> partitionLabels(String s) {
        //stores the last occurance of each character
        Map<Character, Integer> lastOccurance = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            lastOccurance.put(s.charAt(i),i);
        }
        List<Integer> partition = new ArrayList<>();
        int partStart=0, partEnd=0;

        //finding the partitions
        for(int i=0; i<s.length(); i++){
            partEnd = Math.max(partEnd, lastOccurance.get(s.charAt(i)));
            if(i==partEnd){
                partition.add(partEnd - partStart + 1);
                partStart = i+1;
            }
        }
        return partition;
    }
}