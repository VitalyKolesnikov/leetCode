package tasks.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int n : nums1) {
            cache.put(n, cache.getOrDefault(n, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>(nums2.length);

        for (int n : nums2) {
            int temp = cache.getOrDefault(n, -1);
            if (temp > 0) {
                cache.put(n, temp - 1);
                intersection.add(n);
            }
        }
        return intersection.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
