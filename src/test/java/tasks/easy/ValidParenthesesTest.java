package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    void case1() {
        var actual = new ValidParentheses().isValid("()");

        assertTrue(actual);
    }

    @Test
    void case2() {
        var actual = new ValidParentheses().isValid("()[]{}");

        assertTrue(actual);
    }

    @Test
    void case3() {
        var actual = new ValidParentheses().isValid("(]");

        assertFalse(actual);
    }

    @Test
    void case4() {
        var actual = new ValidParentheses().isValid("[");

        assertFalse(actual);
    }

    @Test
    void case5() {
        var actual = new ValidParentheses().isValid("]");

        assertFalse(actual);
    }

    @Test
    void case6() {
        var actual = new ValidParentheses().isValid("([)]");

        assertFalse(actual);
    }

}