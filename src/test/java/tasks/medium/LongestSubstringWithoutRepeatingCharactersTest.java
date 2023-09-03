package tasks.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void case1() {
        int actual = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb");
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void case2() {
        int actual = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb");
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void case3() {
        int actual = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew");
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void case4() {
        int actual = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcsssstringsss");
        assertThat(actual).isEqualTo(6);
    }

    @Test
    void case5() {
        int actual = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("aab");
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void case6() {
        int actual = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("dvdf");
        assertThat(actual).isEqualTo(3);
    }

}
