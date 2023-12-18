package tasks.easy;

public class RomanToInteger {

    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int result = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 'I') {
                result += 1;
            } else if (arr[i] == 'V') {
                if (i > 0 && arr[i - 1] == 'I') {
                    result += 4;
                    i--;
                    continue;
                }
                result += 5;
            } else if (arr[i] == 'X') {
                if (i > 0 && arr[i - 1] == 'I') {
                    result += 9;
                    i--;
                    continue;
                }
                result += 10;
            } else if (arr[i] == 'L') {
                if (i > 0 && arr[i - 1] == 'X') {
                    result += 40;
                    i--;
                    continue;
                }
                result += 50;
            } else if (arr[i] == 'C') {
                if (i > 0 && arr[i - 1] == 'X') {
                    result += 90;
                    i--;
                    continue;
                }
                result += 100;
            } else if (arr[i] == 'D') {
                if (i > 0 && arr[i - 1] == 'C') {
                    result += 400;
                    i--;
                    continue;
                }
                result += 500;
            } else if (arr[i] == 'M') {
                if (i > 0 && arr[i - 1] == 'C') {
                    result += 900;
                    i--;
                    continue;
                }
                result += 1000;
            }

        }

        return result;
    }

}
