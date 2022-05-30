package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {
    @Test
    void case1() {
        int[] actual = new int[]{0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(actual);

        int[] expected = new int[]{1, 3, 12, 0, 0};

        assertArrayEquals(expected, actual);
    }

    @Test
    void case2() {
        int[] actual = new int[]{0};
        new MoveZeroes().moveZeroes(actual);

        int[] expected = new int[]{0};

        assertArrayEquals(expected, actual);
    }
}