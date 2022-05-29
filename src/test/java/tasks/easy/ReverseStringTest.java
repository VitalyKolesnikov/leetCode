package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {
    @Test
    void case1() {
        var arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        new ReverseString().reverseString(arr);
        var expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(expected, arr);
    }

    @Test
    void case2() {
        var arr = new char[]{'H','a','n','n','a','h'};
        new ReverseString().reverseString(arr);
        var expected = new char[]{'h','a','n','n','a','H'};
        assertArrayEquals(expected, arr);
    }
}
