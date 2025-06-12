class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }
        Map<Character, String> digToLtr = new HashMap<>();
        digToLtr.put('2', "abc");
        digToLtr.put('3', "def");
        digToLtr.put('4', "ghi");
        digToLtr.put('5', "jkl");
        digToLtr.put('6', "mno");
        digToLtr.put('7', "pqrs");
        digToLtr.put('8', "tuv");
        digToLtr.put('9', "wxyz");

        backtrack(digits,0, new StringBuilder(), res, digToLtr);
        return res;
    }
    private void backtrack(String digits, int idx, StringBuilder combn, List<String> res, Map<Character, String> digToLtr){
        if(idx == digits.length()){
            res.add(combn.toString());
            return;
        }
        String letters = digToLtr.get(digits.charAt(idx));
        for(char letter : letters.toCharArray()){
            combn.append(letter);
            backtrack(digits, idx+1, combn, res, digToLtr);
            combn.deleteCharAt(combn.length() - 1);
        }
    }
}