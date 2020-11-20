package tasks;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversed = 0, remainder, temp = x;
        do {
            remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp /= 10;
        } while (temp != 0);
        return x == reversed;
    }
}