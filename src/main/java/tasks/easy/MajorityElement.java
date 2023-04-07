package tasks.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int goal = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.merge(i, 1, Integer::sum);
            if (map.get(i) > goal) {
                return i;
            }
        }

        throw new RuntimeException("No majority element found");
    }
}
