package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    @Test
    void case1() {
        assertTrue(new ValidAnagram().isAnagram("asd", "sad"));
    }

    @Test
    void case2() {
        assertTrue(new ValidAnagram().isAnagram("lamp", "palm"));
    }

    @Test
    void case3() {
        assertTrue(new ValidAnagram().isAnagram("cartoon", "nootcar"));
    }

    @Test
    void case4() {
        assertTrue(new ValidAnagram().isAnagram("steel", "sleet"));
    }

    @Test
    void case5() {
        assertFalse(new ValidAnagram().isAnagram("combo", "bloom"));
    }
}