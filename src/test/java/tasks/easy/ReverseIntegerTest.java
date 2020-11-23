package tasks.easy;

import org.junit.jupiter.api.Test;
import tasks.easy.ReverseInteger;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    @Test
    void case1() {
        assertEquals(321, new ReverseInteger().reverse(123));
    }

    @Test
    void case2() {
        assertEquals(-321, new ReverseInteger().reverse(-123));
    }

    @Test
    void case3() {
        assertEquals(21, new ReverseInteger().reverse(120));
    }

    @Test
    void case4() {
        assertEquals(0, new ReverseInteger().reverse(0));
    }

    @Test
    void case5() {
        assertEquals(0, new ReverseInteger().reverse(0));
    }

    @Test
    void case6() {
        assertEquals(0, new ReverseInteger().reverse(1534236469));
    }

}