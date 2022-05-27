package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {
    @Test
    void case1() {
        assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void case2() {
        assertTrue(new ValidPalindrome().isPalindrome("Argentina manit negra"));
    }

    @Test
    void case3() {
        assertFalse(new ValidPalindrome().isPalindrome("Lorem ipsum"));
    }

}
