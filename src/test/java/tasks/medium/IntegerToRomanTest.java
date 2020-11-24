package tasks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    IntegerToRoman itr = new IntegerToRoman();

    @Test
    void repetitionI() {
        assertEquals("I", itr.intToRoman(1));
        assertEquals("II", itr.intToRoman(2));
        assertEquals("III", itr.intToRoman(3));
    }

    @Test
    void repetitionX() {
        assertEquals("X", itr.intToRoman(10));
        assertEquals("XX", itr.intToRoman(20));
        assertEquals("XXX", itr.intToRoman(30));
    }

    @Test
    void repetitionC() {
        assertEquals("C", itr.intToRoman(100));
        assertEquals("CC", itr.intToRoman(200));
        assertEquals("CCC", itr.intToRoman(300));
    }

    @Test
    void repetitionM() {
        assertEquals("M", itr.intToRoman(1000));
        assertEquals("MM", itr.intToRoman(2000));
        assertEquals("MMM", itr.intToRoman(3000));
    }

    @Test
    void fivesV() {
        assertEquals("V", itr.intToRoman(5));
        assertEquals("L", itr.intToRoman(50));
        assertEquals("D", itr.intToRoman(500));
    }

    @Test
    void fivesRepetition() {
        assertEquals("VI", itr.intToRoman(6));
        assertEquals("VII", itr.intToRoman(7));
        assertEquals("VIII", itr.intToRoman(8));

        assertEquals("LV", itr.intToRoman(55));
        assertEquals("LVI", itr.intToRoman(56));
        assertEquals("LVII", itr.intToRoman(57));
        assertEquals("LVIII", itr.intToRoman(58));

        assertEquals("DLV", itr.intToRoman(555));
        assertEquals("DLVI", itr.intToRoman(556));
        assertEquals("DLVII", itr.intToRoman(557));
        assertEquals("DLVIII", itr.intToRoman(558));
    }

    @Test
    void subtraction() {
        assertEquals("IV", itr.intToRoman(4));
        assertEquals("XL", itr.intToRoman(40));
        assertEquals("CD", itr.intToRoman(400));

        assertEquals("IX", itr.intToRoman(9));
        assertEquals("XC", itr.intToRoman(90));
        assertEquals("CM", itr.intToRoman(900));
    }

    @Test
    void mixed() {
        assertEquals("LVIII", itr.intToRoman(58));
        assertEquals("MCMXCIV", itr.intToRoman(1994));
        assertEquals("MMDXXXVIII", itr.intToRoman(2538));
        assertEquals("CLXXIX", itr.intToRoman(179));
        assertEquals("CMXCIX", itr.intToRoman(999));
        assertEquals("MCXI", itr.intToRoman(1111));
    }
}