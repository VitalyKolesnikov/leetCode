package tasks.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list1 = Arrays.stream(nums1)
                .boxed()
                .limit(m)
                .collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(nums2)
                .boxed()
                .limit(n)
                .collect(Collectors.toList());

        List<Integer> resultList = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = resultList.get(i);
        }
    }
}
