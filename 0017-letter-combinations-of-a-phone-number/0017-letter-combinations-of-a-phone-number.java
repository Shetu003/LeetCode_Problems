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

        if (digits == null || digits.length() == 0) { //edge case 
            return res;
        }

        backtrack(0, new StringBuilder(), digits, phoneMap, res); //i = 0 — starting index , path = "" — current combination, digits = "23", res = [] — result list
        return res;
    }

    private void backtrack(int i, StringBuilder path, String digits, Map<Character, String> phoneMap,List<String> res) {
        if (i == digits.length()) { //i=0 != 2, then skip 
            res.add(path.toString());
            return;
        }

        String letters = phoneMap.get(digits.charAt(i)); //Get the digit at current index i, and find the corresponding letters i.e, '2' -> "abc"
        for (char c : letters.toCharArray()) {
            path.append(c); //iterate through the letter of digit and add current letter to path i.e, "a"
            backtrack(i + 1, path, digits, phoneMap, res); //move to the next digit 
            path.deleteCharAt(path.length() - 1);
        }
    }
}