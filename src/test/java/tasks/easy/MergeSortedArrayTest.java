package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    @Test
    void case1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int[] result = new int[]{1, 2, 2, 3, 5, 6};

        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        assertArrayEquals(result, nums1);
    }

    @Test
    void case2() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int[] result = new int[]{1};

        new MergeSortedArray().merge(nums1, 1, nums2, 0);
        assertArrayEquals(result, nums1);
    }

    @Test
    void case3() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int[] result = new int[]{1};

        new MergeSortedArray().merge(nums1, 0, nums2, 1);
        assertArrayEquals(result, nums1);
    }

    @Test
    void case4() {
        int[] nums1 = new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 2};
        int[] result = new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3};

        new MergeSortedArray().merge(nums1, 6, nums2, 3);
        assertArrayEquals(result, nums1);
    }

}
