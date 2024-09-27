import java_leetcode.remove_duplicates_from_sorted_array.RemoveDuplicatesFromSortedArray;
import java_leetcode.remove_duplicates_from_sortedarray_II.RemoveDuplicatesFromSortedArrayII;
import java_leetcode.remove_element.RemoveElement;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,3};
        RemoveDuplicatesFromSortedArrayII removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArrayII();
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }
}