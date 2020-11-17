package tasks;

public class ReverseInteger {
    public int reverse(int x) {
        boolean positive = true;
        if (x < 0) {
            positive = false;
        }
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (!positive) {
            sb.deleteCharAt(sb.length() - 1);
        }
        long longResult = Long.parseLong(sb.toString());
        if (longResult > Integer.MAX_VALUE) {
            return 0;
        }
        int result = (int)longResult;
        return positive ? result : result * -1;
    }
}