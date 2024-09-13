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
    public static class XorOperations {
        public int[] xorQueries(int[] arr, int[][] queries) {
            int[] solution = new int[queries.length];

            for (int i = 0; i < queries.length; i++) {
                int start = queries[i][0];
                int end = queries[i][1];
                int xor = 0;

                for(int j = start; j <= end; j++) {
                    xor ^= arr[j];
                }
                solution[i] = xor;
                System.out.println(Arrays.toString(solution));
            }

            return solution;
        }
    }
}
