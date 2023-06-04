package tasks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HIndexTest {

    @Test
    void case1() {
        int actual = new HIndex().hIndex(new int[]{3, 0, 6, 1, 5});
        assertEquals(3, actual);
    }

    @Test
    void case2() {
        int actual = new HIndex().hIndex(new int[]{1, 3, 1});
        assertEquals(1, actual);
    }

    @Test
    void case3() {
        int actual = new HIndex().hIndex(new int[]{5, 3, 3, 3, 4, 3, 5, 4, 6, 7, 9});
        assertEquals(5, actual);
    }

}
