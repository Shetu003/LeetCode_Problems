class Solution {
    public String[] sortPeople(String[] names, int[] height) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0; i<names.length; i++){
            map.put(height[i],names[i]);
        }
        Arrays.sort(height);
        String[] sorted = new String[names.length];
        int index = 0;
        for(int i=height.length-1; i>=0; i--){
            sorted[index] = map.get(height[i]);
            index++;
        }
        return sorted;
    }
}
