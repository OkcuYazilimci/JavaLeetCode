package java_leetcode.merge_strings_alternately;

class Solution{
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder(100);
        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()){
            if (i < word1.length()) {
                output.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                output.append(word2.charAt(j));
                j++;
            }
        }
        return output.toString();
    }
}
