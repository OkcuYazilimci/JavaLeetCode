package java_leetcode.find_the_difference;

public class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0;

        for (int i = 0; i < s.length(); i++) {
            xor = xor ^ s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            xor^=t.charAt(i);
        }

        return (char)xor;
    }
}
