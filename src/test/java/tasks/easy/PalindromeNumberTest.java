package tasks.easy;

import org.junit.jupiter.api.Test;
import tasks.easy.PalindromeNumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    @Test
    void case1() {
        assertTrue(new PalindromeNumber().isPalindrome(121));
    }

    @Test
    void case2() {
        assertFalse(new PalindromeNumber().isPalindrome(-121));
    }

    @Test
    void case3() {
        assertFalse(new PalindromeNumber().isPalindrome(10));
    }

    @Test
    void case4() {
        assertFalse(new PalindromeNumber().isPalindrome(-101));
    }

}