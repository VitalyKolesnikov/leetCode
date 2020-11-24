package tasks.medium;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int exp = 0;
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int digit = num % 10;
            if (digit == 4 || digit == 9) result.insert(0, subtraction(exp, digit));
            else if (digit >= 6) result.insert(0, fives(exp) + repetition(exp, digit - 5));
            else if (digit == 5) result.insert(0, fives(exp));
            else if (digit >= 1) result.insert(0, repetition(exp, digit));
            num /= 10;
            exp++;
        }
        return result.toString();
    }

    public String repetition(int exp, int count) {
        if (exp == 0) return  "I".repeat(count);
        else if (exp == 1) return "X".repeat(count);
        else if (exp == 2) return "C".repeat(count);
        else return "M".repeat(count);
    }

    public String fives(int exp) {
        if (exp == 0) return "V";
        if (exp == 1) return "L";
        return "D";
    }

    public String subtraction(int exp, int num) {
        if (num == 4) {
            if (exp == 0) return "IV";
            if (exp == 1) return "XL";
            return "CD";
        } else {
            if (exp == 0) return "IX";
            if (exp == 1) return "XC";
            return "CM";
        }
    }
}