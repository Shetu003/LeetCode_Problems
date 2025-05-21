class Solution {
    public String[] sortPeople(String[] names, int[] height) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0; i<names.length; i++){
            map.put(height[i],names[i]);
        }
        Arrays.sort(height);
        String[] sorted = new String[names.length];
        int n = names.length;
        for(int i=0; i<n; i++){
            sorted[i] = map.get(height[n-1-i]);
        }
        return sorted;
    }
}
