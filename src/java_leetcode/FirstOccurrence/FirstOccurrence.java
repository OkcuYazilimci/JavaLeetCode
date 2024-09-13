package java_leetcode.FirstOccurrence;

import java.util.Arrays;

public class FirstOccurrence {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                System.out.println(haystack.substring(i, i + needle.length()));
                return i;
            }
        }
        return -1;
    }
}
