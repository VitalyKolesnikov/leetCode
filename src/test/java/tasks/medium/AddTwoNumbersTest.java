package tasks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.medium.AddTwoNumbers.*;
import static tasks.medium.AddTwoNumbers.ListNode.*;

class AddTwoNumbersTest {

    AddTwoNumbers atn = new AddTwoNumbers();

    @Test
    void case1() {
        ListNode l1 = fromString("243");
        ListNode l2 = fromString("564");
        ListNode res = fromString("708");

        assertEquals(res, atn.addTwoNumbers(l1, l2));
    }

    @Test
    void case2() {
        ListNode l1 = fromString("0");
        ListNode l2 = fromString("0");
        ListNode res = fromString("0");

        assertEquals(res, atn.addTwoNumbers(l1, l2));
    }

    @Test
    void case3() {
        ListNode l1 = fromString("9999999");
        ListNode l2 = fromString("9999");
        ListNode res = fromString("89990001");

        assertEquals(res, atn.addTwoNumbers(l1, l2));
    }

    @Test
    void case4() {
        ListNode l1 = fromString("9");
        ListNode l2 = fromString("1999999999");
        ListNode res = fromString("00000000001");

        assertEquals(res, atn.addTwoNumbers(l1, l2));
    }

    @Test
    void case5() {
        ListNode l1 = fromString("991");
        ListNode l2 = fromString("1");
        ListNode res = fromString("002");

        assertEquals(res, atn.addTwoNumbers(l1, l2));
    }
}