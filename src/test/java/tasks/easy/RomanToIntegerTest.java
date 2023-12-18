package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    @Test
    void case1() {
        var actual = new RomanToInteger().romanToInt("III");

        assertEquals(actual, 3);
    }

    @Test
    void case2() {
        var actual = new RomanToInteger().romanToInt("LVIII");

        assertEquals(actual, 58);
    }

    @Test
    void case3() {
        var actual = new RomanToInteger().romanToInt("MCMXCIV");

        assertEquals(actual, 1994);
    }

    @Test
    void case4() {
        var actual = new RomanToInteger().romanToInt("IX");

        assertEquals(actual, 9);
    }

}
