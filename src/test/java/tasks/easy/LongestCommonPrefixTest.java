package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    @Test
    void case1() {
        var actual = new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"});

        assertEquals(actual, "fl");
    }

    @Test
    void case2() {
        var actual = new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "racecar", "car"});

        assertEquals(actual, "");
    }

    @Test
    void case3() {
        var actual = new LongestCommonPrefix().longestCommonPrefix(new String[]{"a"});

        assertEquals(actual, "a");
    }

}
