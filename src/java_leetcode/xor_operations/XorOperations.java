package java_leetcode.xor_operations;

import java.util.Arrays;

public class XorOperations {
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
