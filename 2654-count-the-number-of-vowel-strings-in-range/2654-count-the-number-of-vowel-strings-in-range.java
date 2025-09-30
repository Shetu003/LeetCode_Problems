class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        while(left <= right){
            char fstWord = words[left].charAt(0);
            char lastWord = words[left].charAt(words[left].length()-1);

            if(fstWord=='a' || fstWord=='e' || fstWord=='i' || fstWord=='o' || fstWord=='u'){
                if(lastWord=='a' || lastWord=='e' || lastWord=='i' || lastWord=='o' || lastWord=='u'){
                    count++;
                }
            }
            left++;
        }
        return count;
    }
}