package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntersectionOfTwoArraysIITest {

    @Test
    void case1() {
        var arr1 = new int[]{1, 2, 2, 1};
        var arr2 = new int[]{2, 2};

        var actual = new IntersectionOfTwoArraysII().intersect(arr1, arr2);
        var expected = new int[]{2, 2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void case2() {
        var arr1 = new int[]{4, 9, 5};
        var arr2 = new int[]{9, 4, 9, 8, 4};

        var actual = new IntersectionOfTwoArraysII().intersect(arr1, arr2);
        var expected = new int[]{9, 4};

        assertArrayEquals(expected, actual);
    }

}