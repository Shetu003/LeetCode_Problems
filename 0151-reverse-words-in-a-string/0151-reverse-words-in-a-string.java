class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" +"); // Split by one or more spaces
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) { // Traverse words from end to start
            sb.append(words[i]); // Add word to result
            if (i != 0)
                sb.append(" "); // Add space between words
        }
        return sb.toString().trim();
    }
}
