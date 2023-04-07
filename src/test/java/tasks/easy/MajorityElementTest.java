package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {

    @Test
    void case1() {
        int actual = new MajorityElement().majorityElement(new int[]{3, 3, 1, 3, 4});
        assertEquals(3, actual);
    }

    @Test
    void case2() {
        int actual = new MajorityElement().majorityElement(new int[]{2, 1, 2, 2, 2});
        assertEquals(2, actual);
    }

    @Test
    void case3() {
        int actual = new MajorityElement().majorityElement(new int[]{3, 3, 1, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5});
        assertEquals(5, actual);
    }

    @Test
    void case4() {
        int actual = new MajorityElement().majorityElement(new int[]{-5, -5, 3, 8, -5});
        assertEquals(-5, actual);
    }

    @Test
    void case5() {
        int actual = new MajorityElement().majorityElement(new int[]{15, 15, 48, 15});
        assertEquals(15, actual);
    }

    @Test
    void case6() {
        int actual = new MajorityElement().majorityElement(new int[]{-5, -5, 0, 0, 0, 1, 2, 0, 0});
        assertEquals(0, actual);
    }

}
