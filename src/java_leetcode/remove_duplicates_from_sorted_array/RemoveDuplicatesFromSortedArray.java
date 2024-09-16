package java_leetcode.remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    nums[j] = 0;
                    k++;
                }
            }
        }
        return k;
    }

    public static class RemoveDuplicatesFromSortedArray2{
        public int removeDuplicates(int[] nums) {
            int k = 1;
            for (int i=1; i<nums.length; i++) {
                if (nums[i] != nums[i-1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    }
}
