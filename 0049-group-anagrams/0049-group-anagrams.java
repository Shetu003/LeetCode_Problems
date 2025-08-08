class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Step 1: Create a HashMap where
        // key = sorted version of string
        // value = list of words (anagrams) that match the sorted key
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] chars = s.toCharArray(); //break string into array of chars
            Arrays.sort(chars); //sort the chars
            String key = new String(chars); //make a string of sorted char

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>()); //if not in map then add the key 
            }
            map.get(key).add(s); //add the original string in arraylist
        }
        return new ArrayList<>(map.values());       
    }
}

