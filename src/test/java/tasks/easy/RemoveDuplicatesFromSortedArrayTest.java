package tasks.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray rem = new RemoveDuplicatesFromSortedArray();

    @Test
    void case1() {
        int[] input = new int[]{1, 1, 2};
        int len = rem.removeDuplicates(input);
        int[] expected = new int[]{1, 2};
        int[] actual = Arrays.copyOfRange(input, 0, expected.length);

        assertArrayEquals(expected, actual);
        assertEquals(expected.length, len);
    }

    @Test
    void case2() {
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = rem.removeDuplicates(input);
        int[] expected = new int[]{0, 1, 2, 3, 4};
        int[] actual = Arrays.copyOfRange(input, 0, expected.length);

        assertArrayEquals(expected, actual);
        assertEquals(expected.length, len);
    }

    @Test
    void case3() {
        int[] input = new int[]{0, 0, 15, 15, 15, 23, 23, 75, 76, 78, 78, 78};
        int len = rem.removeDuplicates(input);
        int[] expected = new int[]{0, 15, 23, 75, 76, 78};
        int[] actual = Arrays.copyOfRange(input, 0, expected.length);

        assertArrayEquals(expected, actual);
        assertEquals(expected.length, len);
    }

    @Test
    void case4() {
        int[] input = new int[]{};
        int len = rem.removeDuplicates(input);
        int[] expected = new int[]{};
        int[] actual = Arrays.copyOfRange(input, 0, expected.length);

        assertArrayEquals(expected, actual);
        assertEquals(expected.length, len);
    }
}