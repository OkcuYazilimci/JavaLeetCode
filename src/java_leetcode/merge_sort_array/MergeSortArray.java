package java_leetcode.merge_sort_array;

import java.util.Arrays;

public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < m + n ; i++ ) {
            nums1[i] = nums2[j];
            j++;
        }

        for (int i = 0; i < m + n - 1; i++) {
            for (int a = 0; a < m + n - i - 1; a++) {
                if (nums1[a] > nums1[a + 1]) {
                    int temp = nums1[a];
                    nums1[a] = nums1[a + 1];
                    nums1[a + 1] = temp;
                }
            }
        }
    }

    public static class MergeSortArray2 {
        public void merge(int[] nums1, int[] nums2, int m, int n) {
            int k = 0;

            while (k < n) {
                nums1[m] = nums2[k];
                m++;
                k++;
            }
            Arrays.sort(nums1);
        }
    }
}
