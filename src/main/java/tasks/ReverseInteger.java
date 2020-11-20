package tasks;

public class ReverseInteger {
    public int reverse(int x) {
        long reversed = 0, remainder, temp = x;
        while (true) {
            remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp /= 10;
            if (temp == 0) {
                if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) return 0;
                return (int) reversed;
            }
        }
    }
}