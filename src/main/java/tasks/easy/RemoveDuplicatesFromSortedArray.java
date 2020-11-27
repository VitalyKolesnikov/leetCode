package tasks.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int currentValue = nums[0];
        int index = 0;
        for (int i : nums) {
            if (i != currentValue) currentValue = nums[++index] = i;
        }
        return ++index;
    }
}