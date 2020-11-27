package tasks.medium;

public class IntegerToRoman {
    public String intToRoman(int num) {
        String[] romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] ints = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ints.length; i++) {
            while (num >= ints[i]) {
                num -= ints[i];
                result.append(romans[i]);
            }
        }
        return result.toString();
    }
}