package java_leetcode.remove_element;

import java.util.ArrayList;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) result.add(nums[i]);
        }
        System.out.println(result);
        return result.size();
    }
    public static class RemoveElement2 {
        public int removeElement(int[] nums, int val) {

            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    }
}
