class Solution {
    public List<String> letterCombinations(String digits) {

        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
        
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }
        
        backtrack(0, new StringBuilder(), digits, phoneMap, res);
        return res;
    }

    private void backtrack(int i, StringBuilder path, String digits, Map<Character, String> phoneMqp, List<String> res){
        // while i < digits .length
         // get new  first index of Map
           // make a call to get index plus 1
            // then remove the last value

        if(i == digits.length()){
            res.add(path.toString());
            return;
        }

        String letters = phoneMqp.get(digits.charAt(i));
        for(char c: letters.toCharArray()){
            path.append(c);
            backtrack(i +1, path, digits, phoneMqp, res);
            path.deleteCharAt(path.length() -1);
        }

    }
}